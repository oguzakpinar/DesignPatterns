package compositePattern.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private Employee manager;

    // constructor
    public Employee(String name, String dept, int sal, Employee manager) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public Employee getManager() {
        return manager;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
