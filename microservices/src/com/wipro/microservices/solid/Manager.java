package com.wipro.microservices.solid;

public class Manager implements Employee, Workable {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        System.out.println("Manager: " + name + ", Salary: $" + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing projects.");
    }
}
//Follows LSP & OCP
// Extends Employee & Workable because a Manager works.

