package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class InfosysEmployee {
    private String empName;
    private int empId;
    private int salary;

    public InfosysEmployee(String empName, int empId, int salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }
}

public class IncreaseSalaryOnConditionals {
    // Java program to Print each unique char and its number of occurrences eg "Good Moorning"

    public static void main(String[] args) {
        /**
         *  java program to find the salary less than 280  and match  with 280 for all those employees. And update the 280 to all the employee sal having less than 280 , and print the final Object.
         *
         * EmpId: 1
         * EmpName: Ram
         * Sal: 100
         *
         * EmpId: 2
         * EmpName: Shyam
         * Sal: 250
         *
         * EmpId: 3
         * EmpName: Ganesh
         * Sal: 280
         *
         * EmpId: 4
         * EmpName: Arjun
         * Sal: 200
         *
         * EmpId: 5
         * EmpName: Karn
         * Sal: 300
         */

        List<InfosysEmployee> emp = new ArrayList<>() {{
            add(new InfosysEmployee("Ram", 1, 100));
            add(new InfosysEmployee("Shyam", 2, 250));
            add(new InfosysEmployee("Ganesh", 3, 280));
            add(new InfosysEmployee("Arjun", 4, 200));
            add(new InfosysEmployee("Karn", 5, 300));
        }};

        List<InfosysEmployee> newList = emp.stream()
                .map(e -> {
                    if (e.getSalary() < 280) {
                        e.setSalary(280);
                    }
                    return e;
                })
                .collect(Collectors.toList());

        newList.forEach(System.out::println);


    }
}
