package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        double[] numbers = new double[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

        System.out.print("Enter path of file: ");

        try {
            File file = new File(scanner.next());
            if(!file.exists()) {
                if(file.createNewFile()) {
                    System.out.println("File has been created!");
                }
                else {
                    System.out.println("File could not be created!");
                    System.exit(0);
                }
            }

            DataOutputStream output = new DataOutputStream(new FileOutputStream(file));

            for (int i = 0; i < numbers.length; i++) {
                output.writeDouble(numbers[i]);
            }
            output.flush();
            output.close();

            System.out.println("Output elements of array:");


            DataInputStream input = new DataInputStream(new FileInputStream(file));
            int i = 0;
            while (input.available() > 0) {
                System.out.println((i+1) + " element of array: " + input.readDouble());
                i++;
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.fillInStackTrace());
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println(e.fillInStackTrace());
            System.exit(0);
        }

    }

}