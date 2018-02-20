package com.company;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
      /*  ArrayStack stack = new ArrayStack(15);

        stack.push(10);

        stack.push(11);

        stack.push(1);

        stack.push(0);

        stack.push(5);

        System.out.println(stack.pop()); // this should print 5

        System.out.println(stack.pop()); // this should print 5
        */

      StackedQueue stackedqueue = new StackedQueue();
      stackedqueue.add("e");
      stackedqueue.add("k");
      stackedqueue.add("k");
      stackedqueue.add("5");
      System.out.println(stackedqueue);
    }
}



