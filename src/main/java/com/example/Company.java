package com.example;

import java.util.List;

public class Company {
    private String name;
    private Employee employee;

    // Constructor
    public Company(String name, Employee employee) {
        this.name = name;
        this.employee = employee;
    }

    public Company() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }
}


