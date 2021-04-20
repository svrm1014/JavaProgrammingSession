package com.techpro.javapractice;

/*Test Program to test that all functionalities of Employee and EmployeeDB classes are
operational.
*/
import java.util.Arrays;

public class EmployeeTestProgram {
    public static void main (String[] args) {
//        Creating employees
        Employee employee1 = new Employee(1,"aane","aane@gmail.com",'F',12345.34F);
        Employee employee2 = new Employee(2,"bbonc","bbonc@gmail.com",'M',2345.465F);
        Employee employee3 = new Employee(3,"cchey","cchey@yahoo.com",'F',34567.456F);
//        Creating EmployeeDB instance
        EmployeeDB database = new EmployeeDB();
//        adding employees to arraylist
        database.addEmployee(employee1);
        database.addEmployee(employee2);
        database.addEmployee(employee3);
//        printing array data of employees
        System.out.println(Arrays.toString(database.listAll()));
//        deleting employee Id 2 from the list
        database.deleteEmployee(2);
        System.out.println(Arrays.toString(database.listAll()));
//        Getting salary of employee ID 3
        System.out.println(database.showPaySlip(3));

    }
}
