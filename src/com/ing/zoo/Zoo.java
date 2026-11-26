package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.capabilities.IDoesTricks;
import com.ing.zoo.capabilities.IEatsLeaves;
import com.ing.zoo.capabilities.IEatsMeat;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        // Creating the list of commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Creating the list of animals
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Dog("jack"),
                new Cat("pete")
        ));

        // Creating the input scanner, showing available commands and asking for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw commando in. Beschikbare commandos: ");
        for (String command : commands) System.out.print("| " + command + " |");
        System.out.println();
        String input = scanner.nextLine();

        if (input.equals(commands[0])) {
            // Handling hello commands
            // Prints out all animal names so the user knows their options
            System.out.print("Tegen wie praat u? Je kan alle dieren aanspreken door geen naam in te voeren. Beschikbare dieren: ");
            for (Animal animal : animals) System.out.print("| " + animal.getName() + " |");
            System.out.println();
            String name = scanner.nextLine();

            // Calls all animals if no name was given
            if (name.isEmpty()) {
                for (Animal animal : animals) animal.sayHello();
                return;
            }

            // Searches for the animal with the correct name
            Animal animal = animals.stream()
                    .filter(a -> a.getName().equals(name))
                    .findFirst()
                    .orElse(null);

            if (animal == null) {
                // Handles user input error
                System.out.println("Geen dier heet zo...");
            } else {
                // Calls the hello method on the called animal
                animal.sayHello();
            }
        } else if (input.equals(commands[1])) {
            // Handling feeding with leaves by filtering through each animal that implements IEatsLeaves and calling the related method.
            animals.stream()
                    .filter(a -> a instanceof IEatsLeaves)
                    .forEach(a -> ((IEatsLeaves) a).eatLeaves());
        } else if (input.equals(commands[2])) {
            // Handling feeding with meat by filtering through each animal that implements IEatsMeat and calling the related method.
            animals.stream()
                    .filter(a -> a instanceof IEatsMeat)
                    .forEach(a -> ((IEatsMeat) a).eatMeat());
        } else if (input.equals(commands[3])) {
            // Handling tricks by filtering through each animal that implements IDoesTricks and calling the related method.
            animals.stream()
                    .filter(a -> a instanceof IDoesTricks)
                    .forEach(a -> ((IDoesTricks) a).performTrick());
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
