package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коориднату X:");
        double x = Double.parseDouble(sc.nextLine());
        System.out.println("Введите коориднату Y:");
        double y = Double.parseDouble(sc.nextLine());

        boolean first_circle = (4 > (x - 5) * (x - 5) + (y - 5) * (y - 5));
        boolean second_circle = (4 > (x - 9) * (x - 9) + (y - 5) * (y - 5));
        boolean rectangle = (x > 1 && x < 9 && y > 5 && y < 10);
        boolean figures = (x > 1 && x < 11 && y > 3 && y < 10);


           if(first_circle){
               if(!rectangle){
                   System.out.println("5 Зона");
               }
               else
                   System.out.println("3 Зона");
               }

           if(second_circle){
               if(!rectangle) {
                   System.out.println("6 Зона");
               }
               else
                   System.out.println("4 Зона");

           }
           if(rectangle && !first_circle && !second_circle){
               System.out.println("2 Зона");

           }
           else
               System.out.println("1 Зона");
           }



    }


