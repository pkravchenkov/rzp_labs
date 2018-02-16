package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuffer temp = new StringBuffer();
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        String srcString;
        //На_дворе_трава,_на_траве_дрова
        if(args.length  !=0){
            srcString=args[0];
        }
        else {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            srcString = in.readLine();
        }
        String a[]=srcString.split("_");

        for(int i=0; i < a.length;i++) {
            sb.append(a[i]+"_");
        }
        equal();
        deleteWord();
        reverseWord();
        changeLetters();
        deleteSymbol();
        replaceWords(a);
    }

    public static void equal(){
        temp.replace(0,temp.length(),sb.toString());
    }

    public static void deleteWord(){

        System.out.println(temp.delete(0,temp.indexOf("_")+1).toString());
        equal();

    }

    public static void reverseWord(){

        StringBuffer tempus = new StringBuffer();
        tempus.append(temp.substring(temp.lastIndexOf("_")+1,temp.length())).reverse();
        System.out.println(temp.substring(0,sb.lastIndexOf("_")+1)+tempus);
        equal();
    }

    public static void changeLetters(){
        System.out.println(temp.toString().replace("а","т"));
        equal();
    }

    public static void deleteSymbol(){

        System.out.println(temp.deleteCharAt(1));
        equal();
    }

    public static void replaceWords(String a[]){
        int q= sb.toString().indexOf(a[4]);
        System.out.println(temp.replace(q,temp.length(),a[5]+"_"+a[4]));
    }


}




