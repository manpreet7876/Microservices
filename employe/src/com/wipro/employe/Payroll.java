package com.wipro.employe;

public class Payroll {
    public void processSalary(Employe employee) {
        System.out.println("Processing salary for " + employee.getName() + ": $" + employee.getSalary());
    }
}
