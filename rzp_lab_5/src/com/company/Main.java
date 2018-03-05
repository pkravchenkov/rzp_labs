package com.company;

public class Main {

    public static void main(String[] args) throws InvalidOperationException {

        StackedQueue q=new StackedQueue();
        ArrayStack st=new ArrayStack(5);

        // STACK TEST
        try {                                               //Тест стека на peek
            int a = st.peek();
        }
        catch(InvalidOperationException e){
            System.out.println(e.getMessage());

        }

        try {                                              // Тест стека на pop
            int a = st.pop();
        }
        catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }

        try {                                               //  Тест стека на push
            for (int i = 0; i < 11; i++) {
                st.push(i);
            }
        }
        catch (InvalidOperationException e){
            System.out.println(e.getMessage());
        }

        System.out.println("*******************\n*******************");
       // ТЕСТ ОЧЕРЕДИ
        try {                                               // Тест очереди на dequeue
            int a = q.dequeue();
        }
        catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }

        try {                                              // Тест очереди на peek
            int a = q.peek();
        }
        catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }

        try {                                               // Тест очереди на enqueue
            for (int i = 0; i < 11; i++) {
                q.enqueue(i);
            }
        }
        catch (InvalidOperationException e){
            System.out.println(e.getMessage());
        }

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
