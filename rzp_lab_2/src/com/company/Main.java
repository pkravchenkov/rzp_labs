package com.company;

public class Main {

    public static void main(String[] args) {
	for(int i=0;i < 5;i++){
	    for(int j=4-i;j > 0;j--){
	        System.out.print(" ");
        }
        for(int k=6-i;k < 12;k++){
	        System.out.print("*");

        }
        System.out.println();
    }
    
    }
}
