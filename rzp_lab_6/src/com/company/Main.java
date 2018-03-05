package com.company;

public class Main {

    public static void main(String[] args) throws InvalidOperationException {

        DoubleStack d = new DoubleStack<>(10);

    /*    d.push("wwwww");
        d.push("wwww");
        d.push("www");
        d.push("ww");
        d.push("wwwwwwwww");
        d.push("wwwwwwwww");
        d.push("wwwww");
        d.pop();
        d.pop();
        d.push("wwwww");
        d.push("wwwwwwdddddw");
        d.pop();
        d.push("w");
        d.push("wwwwwwwwwwwwwwwwwwwwwwwww");

        System.out.println("PEEK: "+d.peek());
        System.out.println("SIZE OF DOUBLESTACK: "+d.getSize());
        System.out.println("SIZE2 OF DOUBLESTACK: "+d.getSize2());
        System.out.println("MIN OF DOUBLESTACK: "+d.getMin());
    */
       d.peek();

    }



    public interface Stack<E> {
        void push(E Value) throws InvalidOperationException;
        E peek() throws InvalidOperationException;
        E pop() throws InvalidOperationException;
        int getSize();
        boolean isEmpty();
        boolean isFull() throws InvalidOperationException;
    }
}

