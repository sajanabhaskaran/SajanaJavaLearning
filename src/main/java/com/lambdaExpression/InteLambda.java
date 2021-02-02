package com.lambdaExpression;

public class InteLambda {
    public static void main(String[] args) {
        NumberFunction add= (b,c) -> {
            System.out.println("sum=" + (b + c));
        };
        perform(add);

        NumberFunction subtraction= (a,b) -> {
            System.out.println("Subtraction of "+a+"and "+b+"is :"+ (a-b));
        };
        subtraction.intRun(12,23);
        perform(subtraction);
        perform((a,b) -> {
            System.out.println("Multiplication of "+a+"and "+b+"is :"+ (a*b));
        });
        perform(subtraction,3,2);


    }


    public static void perform(NumberFunction n){
        n.intRun(10,20);
    }

    public static void perform(NumberFunction n, Integer s,Integer l){
        n.intRun(s,l);

    }





}
