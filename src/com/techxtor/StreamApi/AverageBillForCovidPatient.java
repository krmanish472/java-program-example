package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Patient {
    String name;
    int age;
    String disease;
    int amount;

    public Patient(String name, int age, String disease, int amount) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.amount = amount;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", amount=" + amount +
                '}';
    }
}
public class AverageBillForCovidPatient {
    public static void main(String[] args) {
        List<Patient> patientList = Arrays.asList(
                new Patient("P1", 20, "Covid", 18000),
                new Patient("P2", 26, "Fever", 6000),
                new Patient("P3", 29, "Covid", 8000),
                new Patient("P4", 23, "Covid", 12000)
        );

        Double avg = patientList.stream()
                .filter(patient -> patient.getDisease().equals("Covid"))
                .collect(Collectors.averagingDouble(Patient::getAmount));
        System.out.println(avg);
    }
}
