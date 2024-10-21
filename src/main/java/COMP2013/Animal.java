package COMP2013;

public abstract class Animal implements Maintainable {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public abstract void eat();

    public void enjoy(){
        System.out.println(this.getClass().getSimpleName()+ " enjoys life as an animal");
    }
    public String getName(){
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println(name);
    }
}
