package com.techpro.javapractice;

import java.util.Arrays;

public class EmployeeTestProgram {
    public static void main (String[] args) {
        Employee employee1 = new Employee(1,"aane","aane@gmail.com",'F',12345.34F);
        Employee employee2 = new Employee(2,"bbonc","bbonc@gmail.com",'M',2345.465F);
        Employee employee3 = new Employee(3,"cchey","cchey@yahoo.com",'F',34567.456F);
        EmployeeDB database = new EmployeeDB();
        database.addEmployee(employee1);
        database.addEmployee(employee2);
        database.addEmployee(employee3);
        System.out.println(Arrays.toString(database.listAll()));
        database.deleteEmployee(2);
        System.out.println(Arrays.toString(database.listAll()));
        System.out.println(database.showPaySlip(3));
    }
}
