package com.myFilesOperation;

import java.io.*;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        FileOperation fileOperation= new FileOperation();
        fileOperation.fileCreation();


    }

    private static void fileCreation() throws IOException {
        File myFile=new File( "/Users/sda-lund-70-mbpro/java-learn/SajanaJavaLearning/src/main/java/com/MyFiles/javacode.rtf");

        if(myFile.createNewFile()){
            System.out.println("File is created : "+ myFile.getName());
            FileWriter fw= new FileWriter(myFile);
            fw.write("This is the first line of file");
            fw.close();
            BufferedReader bf= new BufferedReader(new FileReader(myFile));
            String s= bf.readLine();
            System.out.println("The lines in the ceated file is : "+s);

            bf.close();
        }
        else {
            System.out.println("There is already a file");
        }



        
    }
}
