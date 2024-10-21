package COMP2013;

public class Bird extends Animal{
    int wingspan;
    public Bird(String name, int wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    @Override
    public void eat() {

    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Wingspan: "+ wingspan);
        System.out.println("Can fly: "+ canFly());
    }

    public boolean canFly() {
        return true;
    }

    @Override
    public void maintain() {

    }
}
