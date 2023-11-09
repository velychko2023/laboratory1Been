package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Company company = (Company) context.getBean("company");

        System.out.println("Company Name: " + company.getName());
        System.out.println("Employee Name: " + company.getEmployee().getName());
        System.out.println("Person Name: " + company.getEmployee().getPerson().getName());
        System.out.println("Address: " + company.getEmployee().getPerson().getAddress().getStreet() + ", " + company.getEmployee().getPerson().getAddress().getCity());
    }
}


