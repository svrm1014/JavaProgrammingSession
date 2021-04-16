package com.techpro.javapractice;

/*an application for employee management having following classes: a)
Create an Employee class with following attributes and behaviors : i) EmpId Int ii)
EmpName String iii) EmpEmail String iv) EmpGender char v) EmpSalary float vi)
GetEmployeeDetails() -> prints employee details
*/

public class Employee {
    private int empId;
    private String empName;
    private String EmpEmail;
    private char EmpGender;
    private float EmpSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.EmpEmail = empEmail;
    }

    public char getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(char empGender) {
        this.EmpGender = empGender;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.EmpSalary = empSalary;
    }

    public void getEmployeeDetails(){

    }

}
