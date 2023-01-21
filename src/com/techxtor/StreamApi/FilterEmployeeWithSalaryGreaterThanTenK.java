package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeeWithSalaryGreaterThanTenK {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Manish", 24, 50000));
        employeeList.add(new Employee("Kumar", 26, 10000));
        employeeList.add(new Employee("Raghav", 25, 20000));

        List<Employee> filteredBySalary = employeeList.stream()
                .filter(emp -> emp.getSalary() > 10000)
                .collect(Collectors.toList());
        filteredBySalary.forEach(System.out::println);

    }
}
