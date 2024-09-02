package com.techxtor.StreamApi.EmployeeOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByAge {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Manish", 24, 50000));
        employeeList.add(new Employee("Kumar", 26, 10000));
        employeeList.add(new Employee("Raghav", 25, 20000));

        List<Employee> sortedByAgeAsc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());

        sortedByAgeAsc.forEach(System.out :: println);

        System.out.println();

        List<Employee> sortedByAgeDesc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .collect(Collectors.toList());

        sortedByAgeDesc.forEach(System.out :: println);
    }
}
