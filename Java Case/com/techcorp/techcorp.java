package com.techcorp;

public class techcorp {
    public static void main(String[] args) {

        Employee employee1 = new Manager("Alice", 80000);
        Employee employee2 = new Intern("Bob", 30000);

        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
    }
}