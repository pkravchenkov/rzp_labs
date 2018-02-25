package com.company;

public class Main {


    public static void main(String[] args){
  /*  ArrayStack st = new ArrayStack(4);
    st.push(1);
    st.push(4);
    st.push(3);
    st.push(7);

    System.out.println(st.peek());
    st.pop();
    System.out.println(st.peek());
    st.push(9);
    System.out.println(st.peek());
    */
        StackedQueue q = new StackedQueue();
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.peek()+" "+q.getSize());
        q.dequeue();
        System.out.println(q.peek()+" "+q.getSize());




    }
    public interface Queue {
        void enqueue(int a);
        int peek();
        int dequeue();
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



