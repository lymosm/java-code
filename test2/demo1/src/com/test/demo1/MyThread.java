package com.test.demo1;
import java.lang.Runnable;

public class MyThread implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "===" + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                System.out.println("finally");
            }
        }
    }
}
