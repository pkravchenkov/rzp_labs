package com.company;



public class StackedQueue implements Main.Queue {
    ArrayStack Stack1;
    ArrayStack Stack2;
    int Size;

    public StackedQueue() {
        Stack1 = new ArrayStack(10);
        Stack2 = new ArrayStack(10);
    }

    public void enqueue(int a) {
        Stack1.push(a);
        Size+=1;

    }
    public int peek() {
        if (this.isEmpty())
            return 0;

        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.pop());
            }
        }

        return Stack2.peek();
    }
    public int dequeue() {
        int x=-1;
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
        return Stack1.isFull()&&Stack2.isFull();
    }
}