package com.techxtor.StreamApi.EmployeeOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBasedOnAgeAndSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Manish", 24, 50000));
        employeeList.add(new Employee("Kumar", 26, 10000));
        employeeList.add(new Employee("Raghav", 25, 20000));

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println); // method reference
    }
}
