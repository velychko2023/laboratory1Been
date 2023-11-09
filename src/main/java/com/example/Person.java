package com.example;

public class Person {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

