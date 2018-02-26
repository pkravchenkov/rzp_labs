package com.company;

public class Main {


    public static void main(String[] args){

    StackedQueue q = new StackedQueue();
        System.out.println("Очередь пуста? "+q.isEmpty());
        q.enqueue(0);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(1);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(10);
        q.enqueue(23);
        q.enqueue(2);
        q.enqueue(20);

        System.out.println("Очередь полна? "+q.isFull());
        System.out.println("Min: "+q.min());
        System.out.println("Удаляем элемент в начале очереди "+q.dequeue());
        System.out.println("Очередь полна? "+q.isFull());
        System.out.println("Количество элементов в очереди "+q.getSize());
        System.out.println("Min: "+q.min());


        System.out.println("\n*************\n*************\n*************\n\n!!Второй тест:!!\n");



    StackedQueue queue1 = new StackedQueue();

       System.out.println("Очередь пуста? "+queue1.isEmpty());
        queue1.enqueue(8);
        System.out.println("Размер очереди: "+queue1.getSize());
        queue1.enqueue(42);
        System.out.println("Элемент в начале очереди "+queue1.peek());
        queue1.dequeue();
        System.out.println("Элемент в начале очереди "+queue1.peek());

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



