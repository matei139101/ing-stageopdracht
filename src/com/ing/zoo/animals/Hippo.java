package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IEatsLeaves;

public class Hippo extends Animal implements IEatsLeaves {
    String helloText = "splash";
    String eatText = "munch munch lovely";

    public Hippo(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}
