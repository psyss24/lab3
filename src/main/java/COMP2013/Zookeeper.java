package COMP2013;

public class Zookeeper extends Employee{
    public Zookeeper(String name, int salary, int EmployeeID) {
        super(name, salary, EmployeeID);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.05 +100);
    }
}
