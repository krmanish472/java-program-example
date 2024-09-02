package com.techxtor.StreamApi.EmployeeOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByCity {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Amar", "Pune"),
                new Employee("Raj", "Mumbai"),
                new Employee("Neha", "Kolkata"),
                new Employee("Manish", "Delhi"),
                new Employee("Shruti", "Pune"),
                new Employee("Dinesh", "Kolkata"),
                new Employee("Neeraj", "Mumbai")
        );

        Map<String, List<Employee>> empListByCity = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(empListByCity);
    }

}
