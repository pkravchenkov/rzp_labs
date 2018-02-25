package com.company;

public class Main {


    public static void main(String[] args){
    ArrayStack st = new ArrayStack(4);
    st.push(1);
    st.push(4);
    st.push(3);
    st.push(7);

    System.out.println(st.getSize());
    System.out.println(st.isFull());


    }
    public interface Queue {
        void enqueue(int a);
        int peek();
        void dequeue();
        int getSize();
        boolean isEmpty();
        boolean isFull();
    }


    public interface Stack {
        void push(int a);
        int peek();
        int pop();
        int getSize();
        boolean isEmpty();
        boolean isFull();
    }












    }



