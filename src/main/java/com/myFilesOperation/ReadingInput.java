package com.myFilesOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingInput {
    public static void main(String[] args) throws IOException {
        ReadingInput readingInput= new ReadingInput();
        //readingInput.inputConsole();
        //readingInput.readingFile();
        readingInput.readScanner();


    }

    private void readScanner() {

        List<String> lines= new ArrayList<>();
        List<String >newLineList=null;
        File file= new File("/Users/sda-lund-70-mbpro/java-learn/SajanaJavaLearning/src/main/java/com/myFilesOperation/input-text.rtf");
        try(Scanner scanner= new Scanner(file)){

            while (scanner.hasNextLine()){
                String data= scanner.nextLine();
                lines.add(data);
                System.out.println(data);
            }
            newLineList=lines.stream().filter(s -> !s.startsWith("a")).collect(Collectors.toList());

        }catch (Exception e){
            System.out.println(e);

        }

        try(FileWriter fw= new FileWriter(file)){
            newLineList.stream().forEach(s -> {
                try {
                    fw.write(s);
                    fw.write(System.getProperty("line.separator"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });

        }catch (IOException e){

        }


    }

    private void readingFile() throws IOException {
        File file;
        BufferedReader br= null;
        try{
            file= new File("/Users/sda-lund-70-mbpro/java-learn/SajanaJavaLearning/src/main/java/com/MyFiles/input-text.rtf");
            br= new BufferedReader(new FileReader(file));
            String str;
            str= br.readLine();
            System.out.println(str);
            while ((str=br.readLine()) != null){
                System.out.println(str);
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }

    private void inputConsole()  {
        try{
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr);
            String text=br.readLine();
            System.out.println(text);

        }catch (IOException e){
            System.out.println(e);
        }


    }
}
