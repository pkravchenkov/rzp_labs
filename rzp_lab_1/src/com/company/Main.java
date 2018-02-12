package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // Вариант 8
        double x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите коориднату X:");
        x = Double.parseDouble(sc.nextLine());

        System.out.println("Введите коориднату Y:");
        y = Double.parseDouble(sc.nextLine());

        if (x > 1 && x < 9 && y > 5 && y < 10) {
            System.out.println("В прямоугольнике");
            if (4 > (x - 5) * (x - 5) + (y - 5) * (y - 5)) {
                System.out.println("В первой окружности");
                if (y >= 5) {
                    System.out.println("3");
                }
                if (y < 5) {
                    System.out.println("5");
                }
            }
            if (4 > (x - 9) * (x - 9) + (y - 5) * (y - 5)) {
                System.out.println("Во второй окружности");
                if (x < 9 && x > 7 && y > 5) {
                    System.out.println("4");
                }
            }

        }
        else
        if(4 > (x - 9) * (x - 9) + (y - 5) * (y - 5)){
            System.out.println("6");
        }
        else
        if(x > 1 && x < 9 && y > 5 && y < 10){
            System.out.println("2");
        }
        else
            System.out.println("1");
    }

}
