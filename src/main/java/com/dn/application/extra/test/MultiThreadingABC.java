package com.dn.application.extra.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadingABC {

        public static class Pool implements Runnable{

            int id;
            public Pool(int id){
                this.id = id;
            }
            @Override
            public void run() {
                //System.out.println("starting..."+id);
                System.out.println("Thread1");

                try{Thread.sleep(5000);}catch (Exception e){}

                //System.out.println("Ending.."+id);
            }
        }
        public static class Pool1 implements Runnable{

            int id;
            public Pool1(int id){
                this.id = id;
            }
            @Override
            public void run() {
                //System.out.println("starting..."+id);
                System.out.println("Thread2");

                try{Thread.sleep(5000);}catch (Exception e){}

                //System.out.println("Ending.."+id);
            }
        }
        public static class Pool2 implements Runnable{

            int id;
            public Pool2(int id){
                this.id = id;
            }
            @Override
            public void run() {
                //System.out.println("starting..."+id);
                System.out.println("Thread3");

                try{Thread.sleep(5000);}catch (Exception e){}

                //System.out.println("Ending.."+id);
            }
        }

        public static void main(String[] args) throws InterruptedException {

            ExecutorService executorService = Executors.newFixedThreadPool(3);
            long start = System.currentTimeMillis();
            for (int i=0;i<5;i++){
                executorService.submit(new Pool(i));
            }
             for (int i=0;i<5;i++){
                executorService.submit(new Pool1(i));
            }
            for (int i=0;i<5;i++){
                executorService.submit(new Pool2(i));
            }
            long end = System.currentTimeMillis();
            //Join method needed
            System.out.println("Time taken by system to complete 10 tasks..."+(end-start));
            executorService.shutdown();
            executorService.awaitTermination(19, TimeUnit.SECONDS);
            System.out.println("All Completed");

        }
}
