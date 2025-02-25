package com.wipro.microservices.solid;

public class SecurityGuard implements Employee {
    private String name;
    private double salary;

    public SecurityGuard(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        System.out.println("Security Guard: " + name + ", Salary: $" + salary);
    }
}
//Follows ISP & OCP
//Security Guard does NOT implement Workable, following ISP