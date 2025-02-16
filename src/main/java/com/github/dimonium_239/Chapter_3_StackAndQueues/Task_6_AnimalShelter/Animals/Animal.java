package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals;

public abstract class Animal {
    protected int label;
    protected String name;

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}

