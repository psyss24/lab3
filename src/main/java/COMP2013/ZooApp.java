package COMP2013;

public class ZooApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo("London", 43);

        System.out.println("zoo1 getInfo");
        zoo1.getInfo();

        System.out.println("zoo2 getInfo");
        zoo2.getInfo();

        System.out.println("/////COMPOUNDS/////");

        Compound birdCage = new Compound("bird cage", 3);
        zoo1.addCompound(birdCage);

        Bird bird = new Bird("bird1", 5);

        Penguin penguin = new Penguin("penguin1", 6);
        birdCage.addAnimal(bird);
        birdCage.addAnimal(penguin);
        birdCage.getInfo();

        System.out.println("/////COMPOUNDS/////");

        ZooCorp zoocorp = new ZooCorp(zoo1);
        zoocorp.addEmployee(new Zookeeper("jimmy", 10000, 1));
        zoocorp.printEmployees();

    }


}

