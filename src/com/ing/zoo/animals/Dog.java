package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IDoesTricks;
import com.ing.zoo.capabilities.IEatsMeat;

import java.util.Random;

public class Dog extends Animal implements IEatsMeat, IDoesTricks {
    public String helloText = "woof woof!";
    public String eatText = "woofing very much";
    public String trick;

    public Dog(String name) {
        super(name);
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "runs after its own tail";
        }
        else
        {
            trick = "digs up treasure";
        }
        System.out.println(trick);
    }
}
