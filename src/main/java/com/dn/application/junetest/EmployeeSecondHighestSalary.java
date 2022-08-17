package com.dn.application.junetest;

import java.util.*;

public class EmployeeSecondHighestSalary {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rakesh",10000));
        employeeList.add(new Employee("Ramesh",25000));
        employeeList.add(new Employee("Dipali",25000));
        employeeList.add(new Employee("Ravi", 14000));
        employeeList.add(new Employee("Raghu",28000));
        employeeList.add(new Employee("Ritesh",28000));
        employeeList.add(new Employee("ABC",28000));

        Collections.sort(employeeList, new compareSalary());

        System.out.println(employeeList);
        //10000,14000,25000,28000,28000


        List<Employee> secondHighest = new ArrayList<>();
        int previousSalary = 0;
        int highestSalary = employeeList.get(employeeList.size()-1).getSalary();

        for(int i = employeeList.size()-2; i>=0; i--){

            if(employeeList.get(i).getSalary()<highestSalary && employeeList.get(i).getSalary()>=previousSalary){
                secondHighest.add(employeeList.get(i));
                previousSalary = employeeList.get(i).getSalary();
            }
        }
        System.out.println(secondHighest);
        //System.out.println(employeeList.get(employeeList.size()-2));
    }
}

class compareSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary()==o2.getSalary())
            return 0;
        else if(o1.getSalary()>o2.getSalary())
            return 1;
        else
            return -1;
    }
}
