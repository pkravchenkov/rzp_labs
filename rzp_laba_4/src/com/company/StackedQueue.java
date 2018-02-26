package com.company;

public class StackedQueue implements Main.Queue {

    ArrayStack Stack1;
    ArrayStack Stack2;
    int Size;
    int Min;

    public StackedQueue() {
        Stack1 = new ArrayStack(10);
        Stack2 = new ArrayStack(10);
    }

    public void enqueue(int a) {
        if(isEmpty()){
            Min=a;
        }
        Stack1.push(a);

        if(Min > a){
            Min=a;
        }
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

    public boolean empty() {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
    public int min(){
        return Stack1.getMin();
    }
}
