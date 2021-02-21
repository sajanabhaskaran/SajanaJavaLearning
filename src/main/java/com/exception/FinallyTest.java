package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {

        FinallyTest finallyTest= new FinallyTest();
        finallyTest.testFinally();
        finallyTest.testTryWithResourses();




    }

    private void testTryWithResourses() {
        try(Scanner s= new Scanner(new BufferedReader(new FileReader("input-text.rtf")))){

        }catch(IOException e){

        }
    }

    private void testFinally() {
        Scanner s = null;

        try {
            s= new Scanner(new BufferedReader(new FileReader("Input-text.txt")));
            while (s.hasNext()){
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e);
        } finally {
            if (s!= null) s.close();
        }
    }

}
