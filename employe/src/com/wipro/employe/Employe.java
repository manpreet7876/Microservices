package com.wipro.employe;

public class Employe {
    private int id;
    private String name;
    private double salary;

    public Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

