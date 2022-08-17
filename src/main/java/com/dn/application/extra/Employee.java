package com.dn.application.extra;

import java.util.Date;

public class Employee implements Comparable<Employee>{

    private String name;
    private Date birthDate;
    private Integer age;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return birthDate != null ? birthDate.equals(employee.birthDate) : employee.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return this.birthDate.compareTo(o.birthDate);
        if(o.birthDate==this.birthDate){
            return 0;
        }
        else if(this.age<o.age)
            return -1;
        return 0;
    }
}
