package com.techpro.javapractice;

/* Program to Create one more class EmployeeDB which has the following methods. i) boolean
addEmployee(Employee e) ii) boolean deleteEmployee(int empId) iii) String
showPaySlip(int empId) iv) Employee[] listAll()*/

import java.util.*;

public class EmployeeDB {
//    Creating database variable of employee type of List to store
    List<Employee> db = new ArrayList<>();

//    Method to add a employee of Employee class type into Arraylist
    public boolean addEmployee(Employee e) {
        return db.add(e);
    }

//    Method to delete employee from ArrayList
    public boolean deleteEmployee(int empId){
        boolean flag = false;
//        Iterartor to run through db arraylist
        Iterator<Employee> iterator = db.iterator();
        while (iterator.hasNext()){
//           Employee class type instance
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                flag = true;
                iterator.remove();
            }
        }return flag;
    }

//    Method to get the salary of  empId
    public String showPaySlip(int empId) {
//        Defining the String type variable to return
        String paySlip = "Not a valid empId";
//        Iterartor to go through arraylist data
        Iterator<Employee> iterator = db.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                float salary = employee.getEmpSalary();
                paySlip = String.valueOf(salary);
            }
        }
        return paySlip;
    }

//    Method to return array of employees from listarray
    public Employee[] listAll() {
        Employee[] listallEmpArray = db.toArray(new Employee[0]);
        return listallEmpArray;
    }


}
