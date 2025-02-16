package com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter;

import com.github.dimonium_239.Chapter_3_StackAndQueues.StackAndQueuesUtils.Queue;
import com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals.Animal;
import com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals.Cat;
import com.github.dimonium_239.Chapter_3_StackAndQueues.Task_6_AnimalShelter.Animals.Dog;

public class ShelterQueue {

    private final Queue<Dog> dogQueue;
    private final Queue<Cat> catQueue;

    private int animalCounter = 0;

    public ShelterQueue() {
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
    }

    public void enqueue(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.setLabel(animalCounter);
            catQueue.add(cat);
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.setLabel(animalCounter);
            dogQueue.add(dog);
        }
        animalCounter++;
    }

    public Animal dequeueAny(){
        Dog firstDog = dogQueue.peek();
        Cat firstCat = catQueue.peek();
        if(firstDog.getLabel() < firstCat.getLabel()){
            return dogQueue.remove();
        }
        return catQueue.remove();
    }

    public Cat dequeueCat(){
        return catQueue.remove();
    }

    public Dog dequeueDog(){
        return dogQueue.remove();
    }

    @Override
    public String toString() {
        return "[Dogs]: " + dogQueue + "\n[Cats]: " + catQueue;
    }
}

