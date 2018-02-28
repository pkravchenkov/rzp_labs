package com.company;
public class ArrayStack implements Main.Stack{
    int Min;
    int size;
    int[] data;
    int trueSize;

    public ArrayStack(int size) {
        data = new int[size];
        trueSize=size;
    }

    public void push (int Value) throws InvalidOperationException{
        try {
            if (size == 0) {
                data[size] = Value;
                Min = Value;
            } else if (Value < Min) {
                data[size] = Value;
                Min = Value;
                assert (data[size] < Min);
            }
            if (isFull()) {
                throw new InvalidOperationException("Stack overload");
            } else {
                data[size] = Value;
            }
            ++size;
        } catch(InvalidOperationException e){
           System.out.println("Stack overload");

        }
    }

    public int peek() throws InvalidOperationException
    {
        if(isEmpty()){
          throw new InvalidOperationException("Stack is empty");
        }
        else
        return data[size-1];
    }
    public int getSize()
    {
        return size;
    }

    public int getMin ()
    {
        return Min;
    }

    public int pop () throws InvalidOperationException
    {
        if (isEmpty()){
        throw new InvalidOperationException("Stack is empty");
        }
        --size;
        int Value = data[size];

        if ( ( size > 0 ) && ( Value < Min ) ) {
            int prevMin = Min;
            Min += Min - Value;
            return prevMin;
        }

        else {
            return Value;
        }
    }

    public boolean isEmpty ()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return data.length==size;
    }
}

