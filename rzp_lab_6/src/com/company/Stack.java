package com.company;

public class Stack<E extends Comparable<E>> implements Main.Stack {

    E Min;
    int size;
    E[] data;
    private final int trueSize;
    private E temp;
    public Stack(int size)
    {
        data = (E[]) new Comparable[size];
        trueSize=size;
    }



    public void push(Object Value) throws InvalidOperationException {
    data[++size]= (E) Value;
    }

    public E peek() throws InvalidOperationException {
        return data[size];
    }


    public E pop() throws InvalidOperationException {
        size--;
        return data[size];

    }


    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size==0;
    }


    public boolean isFull() throws InvalidOperationException {
        return size==trueSize;
    }

    public E getMin()
    {
        E temp=data[size];
        for(int i=size;i > 0;i--){
            if(temp.compareTo(data[i])>0){
                temp=data[i];
            }
        }
        return temp;

    }


}
