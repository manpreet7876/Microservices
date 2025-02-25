package com.wipro.microservices.solid;

public class MainApp {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement();

        Employee manager = new Manager("Alice", 90000);
        Employee dev = new Developer("Bob", "Java", 75000);
        Employee guard = new SecurityGuard("Charlie", 35000);

        ems.addEmployee(manager);
        ems.addEmployee(dev);
        ems.addEmployee(guard);

        System.out.println("\n=== Employee Details ===");
        ems.showEmployees();

        System.out.println("\n=== Work Status ===");
        ems.startWork();
    }
}
