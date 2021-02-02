package com.lambdaExpression;

public class FunctionLambda {
    public static void main(String[] args) {
        StringFunction exclaim = s -> {
            return (s + "!");
        };

        StringFunction ask = s -> {
            return (s + "?");
        };

        StringFunction lowCase= s -> {return s.toLowerCase();};
        printFormatted("SAJANA",lowCase);

        StringFunction upp= s -> {return s.toUpperCase();};
        printFormatted("sreeraj",upp);


        printFormatted("Hey Sajana", exclaim);
        printFormatted("You got a new job", ask);


    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
