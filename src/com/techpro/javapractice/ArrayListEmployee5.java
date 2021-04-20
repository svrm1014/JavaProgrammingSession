package com.techpro.javapractice;

/*Create an ArrayList of Employee( id,name,address,sal) objects and search for particular
Employee object based on id number.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEmployee5 {
//    Employee variables to store data
    private int id;
    private String name;
    private String address;
    private float salary;

//    Constructor to create employee
    public ArrayListEmployee5(int id,String name,String address,float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

//    Method to return employee information
    public String toString() {
        return "Employee Id:" + id + " Employee Name: " + name+ "Employee Address:" + address + "Employee Salary:" + salary;
    }

//    method to get employee id
    public int getEmpId() {
        return id;
    }



    public static void main(String[] args){
//        creating arraylist to store data
        List<ArrayListEmployee5> ale = new ArrayList<>();
//        Creating employees
        ArrayListEmployee5 emp1 = new ArrayListEmployee5(1,"Aaaa","12 lane 3",234567);
        ArrayListEmployee5 emp2 = new ArrayListEmployee5(2,"Bbbbb","12 lane 4",1232343.354F);
        ArrayListEmployee5 emp3 = new ArrayListEmployee5(3,"Cccc","12 lane 9",455677);
//        Adding employee to arraylist
        ale.add(emp1);
        ale.add(emp2);
        ale.add(emp3);
//        Input to search for a particular employee id
        System.out.println("Enter employee id to search in arraylist");
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
//        iterator to search arraylist
        Iterator<ArrayListEmployee5> iterator = ale.iterator();
//        condition to search for a employee with id
        while(iterator.hasNext()) {
            ArrayListEmployee5 employee = iterator.next();
            if(employee.id == empid) {
                System.out.println(employee);
            }

        }


    }
}


