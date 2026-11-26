package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IEatsMeat;

public class Lion extends Animal implements IEatsMeat {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
