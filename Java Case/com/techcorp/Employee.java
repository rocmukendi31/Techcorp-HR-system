package com.techcorp;

public abstract class Employee implements Payable {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    final String getCompanyName() {
        return "TechCorp";
    }

    abstract String getRole();

    void displayEmployeeDetails() {
        System.out.println("Company: " + getCompanyName());
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Bonus: " + calculateBonus());
        System.out.println();
    }
}