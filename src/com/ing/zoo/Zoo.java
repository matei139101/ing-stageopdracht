package com.ing.zoo;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty")
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        if (input.equals(commands[0])) {
            System.out.print("Wie wilt u voeren: ");
            String name = scanner.nextLine();

            Animal animal = animals.stream()
                    .filter(a -> a.getName().equals(name))
                    .findFirst()
                    .orElse(null);

            if (animal == null) {
                System.out.println("Geen dier heet zo...");
            } else {
                animal.sayHello();
            }
        } else if (input.equals(commands[1])) {
            animals.stream()
                    .filter(a -> a instanceof IEatsLeaves)
                    .forEach(a -> ((IEatsLeaves) a).eatLeaves());
        } else if (input.equals(commands[2])) {
            animals.stream()
                    .filter(a -> a instanceof IEatsMeat)
                    .forEach(a -> ((IEatsMeat) a).eatMeat());
        } else if (input.equals(commands[3])) {

        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
