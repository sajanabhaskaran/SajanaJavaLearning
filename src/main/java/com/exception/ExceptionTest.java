package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest= new ExceptionTest();
        exceptionTest.checkedException();
        exceptionTest.uncheckedException();

    }

    private void uncheckedException() {
       // ArrayIndexOutOfBoundsException
        int[] num= new int[2];
        int p= num[3];
        // NullpinterException
        String s= null;
        s.equals("sajana");

    }

    private void checkedException()  {
        File file= new File("vann.txt");
        try {
            FileReader in = new FileReader(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
