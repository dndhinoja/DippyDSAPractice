package com.dn.application.MayTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public void duplicateNUmber(int[] arr){
        Map<Employee,Integer> map= new HashMap<>();
        Employee e1 = new Employee("Dipali",1);
        Employee e2  = new Employee("Raj",2);
        Employee e3  = new Employee("Nirr",2);
        map.put(e1,10);
        map.put(e2,11);
        map.put(e3,12);
        Iterator<Map.Entry<Employee,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }
       // System.out.println(map.put(e1,10));
        //map.put(e2,11);
        //System.out.println(map.put(2,1));
        //System.out.println(map.put(1,2));
        System.out.println(map);

        /*for(int i = 0; i< arr.length; i++){
            int count = 1;
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else {
                map.put(arr[i],++count);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }*/
    }

    public static void main(String[] args) {
        //1,2,3,3,4,5
        Test test = new Test();
        int[] arr = {1,2,3,3,4,5,5};
        test.duplicateNUmber(arr);
    }
}
class Employee{
    String  name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void abc(){
        Employee employee = new Employee("",1);
        employee.def();
    }
    public void def(){
        Employee.abc();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
