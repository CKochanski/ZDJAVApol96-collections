package pl.sda.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String... args) {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        };

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(2, "Dawid"),
                new Employee(1, "Maciej")
        ));

        System.out.println(employees);

        employees.sort(comparator);

        System.out.println(employees);
    }
}
