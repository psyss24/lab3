package COMP2013;

import java.util.ArrayList;

// Base class: Compound
public class Compound {
    private String name;
    private int capacity;
    private ArrayList<Animal> animals;

    public Compound(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addAnimal(Animal animal) { // add 1 animal to compound
        if (animals.size() < capacity) {  //check for room in compound
            animals.add(animal);  // add animal
        } else {
            System.out.println("compound has reached capacity");
        }
    }

    public void getInfo(){
        System.out.println("number of animals " + animals.size());
        for (Animal animal : animals) {
            animal.getInfo(); // print out all animals, need to iterate over all animals
            System.out.println("\n");
        }

    }

}

