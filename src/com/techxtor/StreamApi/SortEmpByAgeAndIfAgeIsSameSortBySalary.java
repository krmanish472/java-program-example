package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmpByAgeAndIfAgeIsSameSortBySalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Manish", 24, 50000));
        employeeList.add(new Employee("Kumar", 26, 10000));
        employeeList.add(new Employee("Raghav", 25, 20000));
        employeeList.add(new Employee("Hero", 26, 100));

        // if age is same, compare using salary
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary))
                .forEach(System.out::println);

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);
    }
}
