package com.techpro.javapractice;

/*program that will have a Vector which is capable of storing emp objects. Use an
Iterator and enumeration to list all the elements of the Vector.*/

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EmployeeVector {
//    employee data variables
    private int id;
    private String name;
    private String address;
    private float salary;

//    constructor of EmployeeVector
    public EmployeeVector(int id,String name,String address,float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

//    Method to return employee details
    @Override
    public String toString() {
        return "EmployeeVector{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args){
//       Creating Vector list to add employees
        List<EmployeeVector> employeeVector = new Vector<>();
//        creating employees
        EmployeeVector employee1 = new EmployeeVector(5,"Dddd","13th pl",567745);
        EmployeeVector employee2 = new EmployeeVector(6,"Eeee","14 th pl",455677.87F);
//        Adding employees to Vector
        employeeVector.add(employee1);
        employeeVector.add(employee2);
//        Printing all employee present in vector using iterator
        Iterator<EmployeeVector> iterator = employeeVector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
