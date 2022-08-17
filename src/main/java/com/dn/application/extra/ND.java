package com.dn.application.extra;

public class ND implements Comparable<ND>{
    int id;
    String name;
    String age;

    public ND(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ND{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(ND o) {
        if(this.id==o.id)
            return 0;
        if(this.id<o.id)
            return -1;
        else
            return 1;
        //return this.name.compareTo(o.name);
    }
}
