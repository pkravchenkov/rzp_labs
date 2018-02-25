package com.company;

import java.util.Arrays;

public class ArrayStack implements Main.Stack{
     int tail;
     int head;
     int[] Data;

    public ArrayStack(int size) {
        Data = new int[size];
    }


    public void push(int element) {

        int DataSize = this.getSize();
        Data[DataSize] = element;
        tail++;
    }

    @Override
    public int peek() {
        return 0;
    }

    public int pop() {
        int result = -1;
        if (tail != head) {
            int DataSize = this.getSize() - 1;
            result = Data[DataSize];
            Data[DataSize] = -1;
            tail--;
        }
        return result;
    }


    public int getSize() {
        return tail;
    }


    public boolean isEmpty() {
        return getSize() == 0;
    }


    public boolean isFull() {
        return getSize() == Data.length;
    }

    public void clear() {
        Arrays.fill(Data, 0);
        head = 0;
        tail = 0;
    }


}