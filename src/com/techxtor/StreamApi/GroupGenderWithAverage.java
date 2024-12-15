package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    private String name;
    private int age;
    private String gender;
    private String dept;

    public Emp(String name, int age, String gender, String dept) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class GroupGenderWithAverage {
    public static void main(String[] args) {
        List<Emp> empList = Arrays.asList(
                new Emp("ABC", 30, "Female", "HR"),
                new Emp("ABC", 20, "Male", "IT"),
                new Emp("ABC", 38, "Male", "HR"),
                new Emp("ABC", 25, "Female", "IT")
        );

        Map<String, Double> genderAvgMap = empList.stream()
                .collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getAge)));
        System.out.println(genderAvgMap);
    }
}
