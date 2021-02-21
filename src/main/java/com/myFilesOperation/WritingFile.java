package com.myFilesOperation;

import java.io.*;

public class WritingFile {
    public static void main(String[] args) throws IOException {
        WritingFile writingFile= new WritingFile();
        writingFile.fileWriter();
        writingFile.inputWriterFile();


    }

    private void inputWriterFile() throws IOException {
        File file= new File("/Users/sda-lund-70-mbpro/java-learn/SajanaJavaLearning/src/main/java/com/MyFiles/output-text.rtf");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        FileWriter fw= new FileWriter(file);
        String input;
        System.out.println("Please enter 'q' if you want to quit");
        input=br.readLine();
        do{
            fw.write(input);
            fw.append('\n');
            input=br.readLine();
        }while (!input.equals("q"));

        br.close();
        fw.close();


    }

    private void fileWriter() throws IOException {
        File file= new File("/Users/sda-lund-70-mbpro/java-learn/SajanaJavaLearning/src/main/java/com/MyFiles/output-text.rtf");
        //BufferedWriter bw= new BufferedWriter(new FileWriter(file));
        FileWriter fw= new FileWriter(file);
        fw.write("This is my new file. I am writing using FileWriter");
        fw.close();

    }
}
