package com.company;
public class ArrayStack {
    int min;
    int size;
    int[] data;
    int trueSize;

    public ArrayStack(int size) {
        data = new int[size];
        trueSize=size;
    }

    public void push ( int val ) {
        if ( size == 0 ) {
            data[size] = val;
            min = val;
        } else if ( val < min) {
            data[size] = 2 * val - min;
            min = val;

            assert (data[size] < min);
        } else {
            data[size] = val;
        }
        ++size;
    }

    public int peek(){
        return data[size-1];
    }
     public int getSize(){
        return size;
     }

    public int getMin () {
        return min;
    }

    public int pop () {
        --size;

        int val = data[size];

        if ( ( size > 0 ) && ( val < min ) ) {
            int prevMin = min;
            min += min - val;
            return prevMin;
        } else {
            return val;
        }
    }

    public boolean isEmpty () {
        return size == 0;
    }
    public boolean isFull () {
        return size==trueSize;
    }
}