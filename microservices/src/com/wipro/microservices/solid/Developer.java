package com.wipro.microservices.solid;

public class Developer implements Employee, Workable {
    private String name;
    private String programmingLanguage;
    private double salary;

    public Developer(String name, String programmingLanguage, double salary) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        System.out.println("Developer: " + name + ", Language: " + programmingLanguage + ", Salary: $" + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

//Follows LSP & OCP
//Developer also implements Workable because they work.