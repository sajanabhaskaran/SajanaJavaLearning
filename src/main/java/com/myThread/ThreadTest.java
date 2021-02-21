package com.myThread;

import java.util.Arrays;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable run1= new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread Created for run1");
            }
        };
        Runnable run2=new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread Created for run2");
            }
        };
        Runnable runLambda= ()-> {
            System.out.println("Running from Lamda");
        };

        Thread t1= new Thread(run1);
        Thread t2=new Thread(run2);
        Thread t3=new Thread(runLambda);
        t1.run();
        t2.run();
        t3.run();
    // Arrays.asList return a List
        List<String> names=Arrays.asList("sree" , "saj" ,"sreyaan") ;
    foo("Sajana","Sreeraj");
    }

    public static void foo(String... s){

        System.out.println(s);
    }

}
