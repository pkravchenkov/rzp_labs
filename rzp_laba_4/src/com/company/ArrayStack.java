package com.company;

import java.util.Arrays;


public class ArrayStack {

    private int tail;
    private int head;
    private int[] Data;


    public ArrayStack(int size) {
        Data = new int[size];
    }


    public void push(int element) {

        int DataSize = this.size();
        Data[DataSize] = element;
        tail++;
    }

    public int pop() {
        int result = -1;
        if (tail != head) {
            int DataSize = this.size() - 1;
            result = Data[DataSize];
            Data[DataSize] = -1;
            tail--;
        }
        return result;
    }

    public void clear() {
        Arrays.fill(Data, 0);
        head = 0;
        tail = 0;
    }

    public int size() {
        return tail;
    }

    public boolean find(int element) {
        for (int i = 0; i < Data.length; i++) {
            if (Data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < Data.length; i++) {
            if (Data[i] == element) {
                return i;
            }
        }
        return 0;
    }
}