package com.company;

public class Main {

    public static void main(String[] args) throws InvalidOperationException {

        StackedQueue q=new StackedQueue();
        ArrayStack st=new ArrayStack(5);







    }

    public interface Queue {
        void enqueue(int a) throws InvalidOperationException;
        int peek() throws InvalidOperationException;
        int dequeue() throws InvalidOperationException;
        int getSize();
        boolean isEmpty();
        boolean isFull();
    }


    public interface Stack {
        void push(int a) throws InvalidOperationException;
        int peek() throws InvalidOperationException;
        int pop() throws InvalidOperationException;
        int getSize();
        boolean isEmpty();
        boolean isFull() throws InvalidOperationException;
    }
}
