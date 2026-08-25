package com.techcorp;

public final class Intern extends Employee {

    Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    String getRole() {
        return "Intern";
    }

    @Override
    public double calculateBonus() {
        return 500.0;
    }
}