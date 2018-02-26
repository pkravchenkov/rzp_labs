package com.company;
public class ArrayStack {
    int Min;
    int size;
    int[] data;
    int trueSize;

    public ArrayStack(int size) {
        data = new int[size];
        trueSize=size;
    }

    public void push ( int Value ) {
        if ( size == 0 ) {
            data[size] = Value;
            Min = Value;
        } else if ( Value < Min) {
            data[size] = Value;
            Min = Value;

            assert (data[size] < Min);
        } else {
            data[size] = Value;
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
        return Min;
    }

    public int pop () {
        --size;
        int Value = data[size];

        if ( ( size > 0 ) && ( Value < Min ) ) {
            int prevMin = Min;
            Min += Min - Value;
            return prevMin;
        } else {
            return Value;
        }
    }

    public boolean isEmpty () {
        return size == 0;
    }
    public boolean isFull () {
        return size==trueSize;
    }
}

