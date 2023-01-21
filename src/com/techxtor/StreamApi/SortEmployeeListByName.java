package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeListByName {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Manish", 24, 50000));
        employeeList.add(new Employee("Kumar", 26, 10000));
        employeeList.add(new Employee("Raghav", 25, 20000));

       List<Employee> sortedByNameAsc =  employeeList.stream()
                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());

       sortedByNameAsc.forEach(System.out:: println);

        System.out.println();

       List<Employee> sortedByNameDesc =  employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());

        sortedByNameDesc.forEach(System.out:: println);
    }
}
