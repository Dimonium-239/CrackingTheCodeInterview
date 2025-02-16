package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter;

import com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals.Cat;
import com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        ShelterQueue shelterQueue = new ShelterQueue();
        shelterQueue.enqueue(new Cat("Cat1"));
        shelterQueue.enqueue(new Dog("Dog1"));
        shelterQueue.enqueue(new Cat("Cat2"));
        shelterQueue.enqueue(new Dog("Dog2"));
        shelterQueue.enqueue(new Cat("Cat3"));
        shelterQueue.enqueue(new Cat("Cat4"));
        System.out.println(shelterQueue);
        System.out.println(shelterQueue.dequeueAny());
        System.out.println(shelterQueue);
        System.out.println(shelterQueue.dequeueCat());
        System.out.println(shelterQueue);
        System.out.println(shelterQueue.dequeueDog());
        System.out.println(shelterQueue);
    }
}
