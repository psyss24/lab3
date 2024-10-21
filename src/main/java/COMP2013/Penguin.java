package COMP2013;

public class Penguin extends Bird{
    public boolean canFly = true;
    public Penguin(String name, int wingspan) {
        super(name, wingspan);
    }
    @Override
    public void getInfo(){
        super.getInfo();
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
