package com.techxtor.StreamApi;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SalaryIncrement {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 70000)
        );

        // Increase salary by 10% and calculate total increased amount
        double totalIncreasedAmount = employees.stream()
                .map(e -> {
                    double newSalary = e.getSalary() * 1.10;
                    double increment = newSalary - e.getSalary();
                    e.setSalary(newSalary);
                    return increment;
                })
                .reduce(0.0, (a, b) -> a + b); // Sum up all increments

        System.out.println("Total Increased Amount: " + totalIncreasedAmount);
    }
}

