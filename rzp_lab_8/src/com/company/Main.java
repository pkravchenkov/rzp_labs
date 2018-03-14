package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file;
        int WordsCount = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a file path:");
        file = new File(scanner.next());

        if (!file.exists()) {
            System.out.println("File not exists");
            System.exit(0);
        }

        if (file.isDirectory()) {
            System.out.println("This is directory, not file");
            System.exit(0);
        }


        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String str = bufferedReader.readLine();
            while (str != null) {
                String[] line = str.split(" ");
                for (int i = 0; i < line.length; i++) {
                    if(!line[i].equals("")) {
                        WordsCount++;
                    }
                }
                str = bufferedReader.readLine();
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("File not exists");
            System.exit(0);
        }

        catch (IOException e) {
            System.out.println("Read error");
            System.exit(0);
        }

        finally {
            System.out.println("The file contains " + WordsCount + " words");
            try {
                bufferedReader.close();
            }
            catch (IOException e) {
            }
        }
    }

}
