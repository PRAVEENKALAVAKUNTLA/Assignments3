package Mainprojects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class FileWriting {
        public static void main(String[] args) {
            File f=new File("C:\\Users\\pkalavakuntla\\Documents\\File.txt");
            if(f.exists()){
                System.out.println("File already exists.");
            }
            else{
                try {
                    if(f.createNewFile()){
                        System.out.println("File has created:"+f.getName());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(f.canWrite()) {
                try {
                    FileWriter fileWriter = new FileWriter("C:\\Users\\pkalavakuntla\\Documents\\File.txt");
                    fileWriter.write("Computer software or just software is a collection of programs and related data that provides the instructions for telling a computer what to do and how to do it.");
                    fileWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
                catch (IOException e){
                    System.out.println(e);
                }
            }

        }
    }


