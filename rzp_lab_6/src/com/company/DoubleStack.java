package com.company;

public class DoubleStack<E extends Comparable<E>> implements Main.Stack {
    private int trueSize;
    int size;
    int Min;
    E temp;

    Stack Stack1;
    Stack Stack2;


    public DoubleStack(int size){
        trueSize=size;
        Stack1 = new Stack(size);
        Stack2 = new Stack(size);

    }


    @Override
    public void push(Object Value) throws InvalidOperationException {
        temp = (E) Value;
        if(Stack1.getSize()==0) {
            Stack1.push(temp);
            Stack2.push(temp);

        }
        else if(temp.compareTo((E) Stack1.getMin()) < 0){
            Stack1.push(Value);
            Stack2.pop();
            Stack2.push(Value);

        }
        else if(temp.compareTo((E)  Stack1.getMin()) > 0){
            Stack1.push(Value);
        }
        else
            Stack1.push(Value);
    }


    public Object peek() throws InvalidOperationException {

        return Stack1.peek();
    }

    @Override
    public Object pop() throws InvalidOperationException {
            if(getSize()==0) {
                Stack2.pop();
            }
            else

            Stack2.pop();
            Stack2.push(Stack1.getMin());
        return Stack1.pop();
    }

    @Override
    public int getSize() {
        return Stack1.getSize();
    }
    public int getSize2() {
        return Stack2.getSize();
    }

    @Override
    public boolean isEmpty() {
        return Stack1.isEmpty();
    }

    @Override
    public boolean isFull() throws InvalidOperationException {
        return Stack1.isFull();
    }

    public E getMin() throws InvalidOperationException {
        Stack2.pop();
        Stack2.push(Stack1.getMin());
        return (E) Stack2.peek();
    }
}
