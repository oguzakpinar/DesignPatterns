package compositePattern.antipattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000, null);

        Employee headSales = new Employee("Robert","Head Sales", 20000, CEO);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000, CEO);

        Employee clerk1 = new Employee("Laura","Marketing", 10000, headMarketing);
        Employee clerk2 = new Employee("Bob","Marketing", 10000, headMarketing);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000, headSales);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000, headSales);

        List<Employee> employees = new ArrayList<>();
        employees.add(CEO);
        employees.add(headMarketing);
        employees.add(headSales);
        employees.add(clerk1);
        employees.add(clerk2);
        employees.add(salesExecutive1);
        employees.add(salesExecutive2);

        //print all employees of the organization
        System.out.println(CEO);
        employees.stream().filter(s -> CEO.equals(s.getManager())).forEach(e -> {
            System.out.println(e);
            employees.stream().filter(s -> e.equals(s.getManager())).forEach(x -> {
                System.out.println(x);
            });

        });
    }
}
