package com.techpro.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    List<Employee> db = new ArrayList<>();
    public boolean addEmployee(Employee e) {
        return db.add(e);
    }
    public boolean deleteEmployee(int empId){
        boolean flag = false;
        Iterator<Employee> iterator = db.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                flag = true;
                iterator.remove();
            }
        }return flag;
    }
    public String showPaySlip(int empId) {
        String paySlip = "Not a valid empId";
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
    public Employee[] listAll() {
        Employee[] listallEmpArray = db.toArray(new Employee[0]);
        return listallEmpArray;
    }

}
