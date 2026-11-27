package com.ing.zoo.animals;

import com.ing.zoo.capabilities.IEatsLeaves;

public class Zebra extends Animal implements IEatsLeaves {
    public String helloText = "zebra zebra";
    public String eatText = "munch munch zank yee bra";

    public Zebra(String name)
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
