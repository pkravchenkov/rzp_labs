package com.company;

public class Main {

    public static void main(String[] args) throws InvalidOperationException {

        DoubleStack d = new DoubleStack<>(10);
        try {
            System.out.println("POP: " + d.pop());
        } catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("PEEK: " + d.peek());
        } catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("MIN OF DOUBLESTACK: "+d.getMin());
        } catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }
        try {
            for(int i=0;i < 11;i++){
                d.push(i);
            }
        }catch(InvalidOperationException e){
            System.out.println(e.getMessage());
        }

        DoubleStack d2 = new DoubleStack<>(10);
        d2.push("sda");
        d2.push("da");
        d2.push("sdsdaa");
        d2.push("sda");
        d2.push("sddda");
        d2.push("sdasa");
        d2.push("ssda");
        d2.push("sddggggggggga");
        System.out.println(d2.getMin());
    }



    public interface Stack<E> {
        void push(E Value) throws InvalidOperationException;
        E peek() throws InvalidOperationException;
        E pop() throws InvalidOperationException;
        int getSize();
        boolean isEmpty();
        boolean isFull() throws InvalidOperationException;
    }
}

