package com.techpro.javapractice;

/*an application for employee management having following classes: a)
Create an Employee class with following attributes and behaviors : i) EmpId Int ii)
EmpName String iii) EmpEmail String iv) EmpGender char v) EmpSalary float vi)
GetEmployeeDetails() -> prints employee details
*/

public class Employee {
//Declaration of Employee variable to store employee details
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;

//    Employee constructor
    public Employee() {
    }

//    Employee Constructor with parameters
    public Employee(int empId,String empName,String empEmail,char empGender,float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;

    }

//    Getter and setter methods to access the employee details

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
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {

        this.empEmail = empEmail;
    }

    public char getEmpGender() {

        return empGender;
    }

    public void setEmpGender(char empGender) {

        this.empGender = empGender;
    }

    public float getEmpSalary() {

        return empSalary;
    }

    public void setEmpSalary(float empSalary) {

        this.empSalary = empSalary;
    }

//    Method to get employee details
    public String getEmployeeDetails() {
        return "Employee ID:" + empId + "EmployeeName:" + empName + "EmployeeEmail:" + empEmail +
                "EmployeeGender:" + empGender + "EmployeeSalary:" + empSalary;
    }

//    toString Method to return employee object
    public String toString() {
        return "Employee ID:" + empId + ", EmployeeName:" + empName + ", EmployeeEmail:" + empEmail +
                ", EmployeeGender:" + empGender + ", EmployeeSalary:" + empSalary;
    }
}
