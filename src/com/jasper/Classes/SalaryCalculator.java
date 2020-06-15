package com.jasper.Classes;

public class SalaryCalculator {
    public static void main(String[] args) {
        var employee = new Employee(50_000,30);
        int wage = employee.calculateWage(12);
        System.out.println(wage);

        // constructor overloaded
        var noExtraHourEmployee = new Employee(100_000);
        System.out.println(Employee.numberOfEmployees);
        System.out.println(Employee.printNumberOfEmployees());
    }

}
