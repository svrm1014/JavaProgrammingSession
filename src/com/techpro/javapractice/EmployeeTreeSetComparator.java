package com.techpro.javapractice;

/*Program Use a TreeSet Object to store employees on the
basis of their EmpId and use enumeration/iterator to process employees. [Hint:
Use Comparable interface]*/

import java.util.Comparator;
import java.util.TreeSet;
//Class to get TreeSet employees
public class EmployeeTreeSetComparator {
    public static void main(String[] args) {
//        Treeset with comparator constructor for sorting by salary
        TreeSet<Employee> tree = new TreeSet<Employee>(new SalaryComparator());
//        adding employee to treeset
        tree.add(new Employee(234, "Tek", "India", 'M', 46756F));
        tree.add(new Employee(224, "pro", "US", 'M', 7567F));
        tree.add(new Employee(200,"dora","UK",'F',465));
//        Printing every entry of treeset
        for (Employee emp : tree) {
            System.out.println(emp);
        }
    }
}

//Custom class implenting the predefined class comparator
class SalaryComparator implements Comparator<Employee> {
    @Override
//compare employees saralary
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getEmpSalary() > emp2.getEmpSalary()){
            return 1;
        }else {
            return -1;
        }
    }
}