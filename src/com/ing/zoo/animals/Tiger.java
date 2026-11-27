package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IDoesTricks;
import com.ing.zoo.capabilities.IEatsMeat;

import java.util.Random;

public class Tiger extends Animal implements IEatsMeat, IDoesTricks {
    public String helloText = "rraaarww";
    public String eatText = "nomnomnom oink wubalubadubdub";
    public String trick;

    public Tiger(String name)
    {
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
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
