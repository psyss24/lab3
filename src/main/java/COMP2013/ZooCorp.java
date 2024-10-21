package COMP2013;

import java.util.ArrayList;


public class ZooCorp {

    private ArrayList<Zoo> ZooList;
    private ArrayList<Employable> employees;

    public ZooCorp(Zoo zoo){
        this.ZooList = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.ZooList.add(zoo);

    }
    public void addZoo(Zoo zoo){
        this.ZooList.add(zoo);
    }

    public void addEmployee(Employable employee) {
        employees.add(employee);
    }

    // Print all employees and their bonuses
    public void printEmployees() {
        for (Employable employee : employees) {
            System.out.println(employee.getEmployeeName() + ", Christmas Bonus: " + employee.calculateChristmasBonus());
        }
    }

}
