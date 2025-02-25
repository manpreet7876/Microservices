package com.wipro.microservices.solid;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            employee.getDetails();
        }
    }

    public void startWork() {
        for (Employee employee : employees) {
            if (employee instanceof Workable) {
                ((Workable) employee).work();
            }
        }
    }
}
//Follows DIP
//Depends on Employee abstraction, not concrete classes (DIP).