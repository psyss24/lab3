package COMP2013;

public abstract class Employee implements Employable{
    protected String name;
    protected int salary;
    protected int EmployeeID;

    public Employee(String name, int salary, int EmployeeID){
        this.name = name;
        this.salary = salary;
        this.EmployeeID = EmployeeID;
    }

    @Override
    public void setEmployeeID(int number) {
        this.EmployeeID = number;
    }

    @Override
    public int getEmployeeID() {
        return this.EmployeeID;
    }

    @Override
    public void setEmployeeName(String name) {
        this.name = name;
    }

    @Override
    public String getEmployeeName() {
        return this.name;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
