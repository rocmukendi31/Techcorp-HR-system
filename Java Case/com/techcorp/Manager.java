package com.techcorp;

public class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    String getRole() {
        return "Manager";
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.20;
    }
}