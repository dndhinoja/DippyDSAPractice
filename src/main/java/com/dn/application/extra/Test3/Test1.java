package com.dn.application.extra.Test3;

public class Test1 {

    private static Test1 test1;

    private Test1(){}

    public static Test1 getInstance(){
      if(test1==null){
          synchronized (Test1.class){
              if(test1==null) {
                  test1 = new Test1();
              }
          }
      }
      return test1;
    }
}
