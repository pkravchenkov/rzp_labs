package com.company;

public class StackedQueue implements Main.Queue {

    ArrayStack Stack1;
    ArrayStack Stack2;
    int Size;

    public StackedQueue() {
        Stack1 = new ArrayStack(10);
        Stack2 = new ArrayStack(10);
    }

    public void enqueue(int a) throws InvalidOperationException {
        if(!isFull()) {
            Stack1.push(a);
            Size+=1;
        }
        else
            throw new InvalidOperationException("Queue is overload");

    }


    public int peek() throws InvalidOperationException {
        try {
            if (Stack2.isEmpty()) {
                while (!Stack1.isEmpty()) {
                    Stack2.push(Stack1.pop());
                }
            }
            return Stack2.peek();
        } catch (InvalidOperationException e){
            throw new InvalidOperationException("Queue is empty");

        }
    }

    public int dequeue() throws InvalidOperationException {
        if(isEmpty()) {
            throw new InvalidOperationException("Queue is empty");
        }


        int x=0;
        while(!Stack1.isEmpty()){
            Stack2.push(Stack1.pop());
        }
        if(!Stack2.isEmpty()){
            x=(int)Stack2.pop();
        }
        while(!Stack2.isEmpty()){
            Stack1.push(Stack2.pop());
        }

        return x;
    }


    public int getSize() {
        return Stack1.getSize()+Stack2.getSize();
    }

    public boolean isEmpty(){
        return Size==0;
    }

    public boolean isFull() {
        return Stack1.isFull();
    }
    public int min(){
        return Stack1.getMin();
    }
}
