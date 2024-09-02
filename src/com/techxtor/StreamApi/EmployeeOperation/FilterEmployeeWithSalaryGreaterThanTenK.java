package com.techxtor.StreamApi.EmployeeOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeeWithSalaryGreaterThanTenK {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>() {
            {
                new Employee("Manish", 24, 50000);
                new Employee("Kumar", 26, 10000);
                new Employee("Raghav", 25, 20000);
            }
        };

        List<Employee> filteredBySalary = employeeList.stream()
                .filter(emp -> emp.getSalary() > 10000)
                .collect(Collectors.toList());
        filteredBySalary.forEach(System.out::println);

    }
}
