package com.example;

public class Employee {
    private String name;
    private Person person;

    // Constructor
    public Employee(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public Employee() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}

