package com.lambdaExpression;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.forEach((n)-> {
            System.out.println(n);
        });


        }



    }

