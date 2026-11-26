package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IDoesTricks;
import com.ing.zoo.capabilities.IEatsMeat;

import java.util.Random;

public class Cat extends Animal implements IEatsMeat, IDoesTricks {
    public String helloText = "why am I in a zoo meow?";
    public String eatText = "meow meow meom meowm.";
    public String trick;

    public Cat(String name) {
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
            trick = "does a backflip";
        }
        else
        {
            trick = "licks itself clean";
        }
        System.out.println(trick);
    }
}
