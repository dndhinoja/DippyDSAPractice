package com.dn.application.extra.tests;

public class CloneExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Toy toy = new Toy();
        toy.x = 1;
        toy.y  =2;
        toy.car.c = 13;


        Toy toy1 = (Toy) toy.clone();
        toy1.x = 2;
        toy1.y = 3;
        //toy1.car.c = 14;

        System.out.println(" "+toy.x+"  "+ toy.y+"  "+toy.car.c);
        System.out.println(" "+toy1.x+"  "+ toy1.y+"  "+toy1.car.c);
    }
}

class Toy implements Cloneable{

    int x;
    int y;
    Car car = new Car();

    public Object clone() throws CloneNotSupportedException {
        Toy toy1 = (Toy)super.clone();
        toy1.car = new Car();
        toy1.car.c = car.c;
        //toy1.car.c = car.c;
        return toy1;
        //return super.clone();
    }

}
class Car{
    int c;

}
