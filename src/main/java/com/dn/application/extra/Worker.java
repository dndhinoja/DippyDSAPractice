package com.dn.application.extra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker extends Thread{

    static Object lock1 = new Object();

    @Override
    public void run(){

            stageOne();
    }
    public void stageOne(){
        synchronized (lock1){
            System.out.println("Thread 1 started..");
            try {lock1.wait();}catch (Exception e){}
            System.out.println("Thread 1 out of wait..");
        }
    }
    public void stageTwo(){
        synchronized (lock1){
            System.out.println("Thread 2 started..");
            try {lock1.wait();}catch (Exception e){}
            System.out.println("Thread 2 out of wait..");
        }
    }
    public void stageThree(){
        synchronized (lock1){
            System.out.println("Thread 3 started..");
            try {lock1.notify();}catch (Exception e){}
            System.out.println("Thread 3 out of wait..");
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int i =0;
        while(i!=3){
            executorService.submit(new Worker());
            executorService.submit(new Worker1());
            executorService.submit(new Worker2());
            i++;
        }
    }

}
class Worker1 extends Thread{
    @Override
    public void run(){
        stageTwo();
    }
    public void stageTwo(){
        synchronized (Worker.lock1){
            System.out.println("Thread 2 started..");
            try {Worker.lock1.wait();}catch (Exception e){}
            System.out.println("Thread 2 out of wait..");
        }
    }
}
class Worker2 extends Thread{
    @Override
    public void run(){
        stageThree();
    }
    public void stageThree(){
        synchronized (Worker.lock1){
            System.out.println("Thread 3 started..");
            try {Worker.lock1.notify();}catch (Exception e){}
            System.out.println("Thread 3 out of wait..");
        }
    }
}


