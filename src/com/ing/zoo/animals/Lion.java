package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IEatsMeat;

public class Lion extends Animal implements IEatsMeat {
    public String helloText = "roooaoaaaaar";
    public String eatText = "nomnomnom thx mate";

    public Lion(String name)
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
}
