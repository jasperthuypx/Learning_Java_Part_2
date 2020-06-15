package com.jasper.Classes;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        // increase each time an employee is created
        numberOfEmployees++;
    }
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        numberOfEmployees++;
    }

    public int calculateWage() {
        return baseSalary;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public static int printNumberOfEmployees() {
        return numberOfEmployees;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }
}
