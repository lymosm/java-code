package com.test.demo1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        /*
        System.out.println("test8888");
        sum(10, 20);
        sum(10, 20, 30);
        testTeacher();
        // scanTest();
        testArray();

        ChildAame obj = new ChildAame();
        obj.getName();

        demoImplClass impl = new demoImplClass();
        impl.getName();
*/

        // Thread
        Runnable mythread = new MyThread();
        Thread th = new Thread(mythread);
        th.start();
        Thread th2 = new Thread(mythread);
        th2.start();
        for(int i = 0; i<= 10; i++){
            System.out.println(Thread.currentThread().getName() + "====" + i);
        }

    }

    public static void testArray(){
        ArrayList<String> arr = new ArrayList<>(4);
        System.out.println("arr is: " + arr);

        Random rd = new Random(1);
        long inter = rd.nextInt();
        System.out.println("Random is: " + inter);

        double ft = -2.89;
        double fl = Math.abs(ft);
        double ints = Math.ceil(3.4);
        System.out.println("Math abs is: " + fl + " " + ints);


    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(int a, int b, int c){
        return (double)a + b + c;
    }

    public static void testTeacher(){
        MyTeacher myt = new MyTeacher();
        String name = myt.getName();
        System.out.println("This is an " + name);
        String myname = new MyTeacher().name;
        System.out.println("N is: " + myname);
    }

    public static void scanTest(){
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        System.out.println("You input val is: " + str);
    }
}
