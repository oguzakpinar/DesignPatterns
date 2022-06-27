package compositePattern.antipattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);
        CEO.addItem(headSales);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        CEO.addItem(headMarketing);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        headMarketing.addItem(clerk1);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        headMarketing.addItem(clerk2);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        headSales.addItem(salesExecutive1);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
        headSales.addItem(salesExecutive2);

        //print all employees of the organization
        System.out.println(CEO);
        CEO.getSubordinates().forEach(s -> {
            System.out.println(s);
            s.getSubordinates().forEach(ss -> {
                System.out.println(ss);
            });
        });

        System.out.println("*********************");
        writeSubOrdinates(CEO);
    }

    private static void writeSubOrdinates(Employee e) {
        System.out.println(e);
        e.getSubordinates().forEach(CompositeMain::writeSubOrdinates);
    }
}
