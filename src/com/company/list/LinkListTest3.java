package com.company.list;

import java.util.LinkedList;

public class LinkListTest3 {

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("Hello");
        ms.push("World");
        ms.push("FanCard");
        ms.push("Forever");

        System.out.println(ms);

        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.isEmpty());
        System.out.println(ms.pop());
        System.out.println(ms.isEmpty());
    }
}


class MyStack {
    private LinkedList list = null;

    MyStack() {
        this.list = new LinkedList();
    }

    void push(Object o) {
        this.list.add(o);
    }

    Object pop() {
        return this.list.removeLast();
    }

    Object peek() {
        return this.list.peekLast();
    }

    boolean isEmpty() {
        return this.list.size() == 0;
    }

    public String toString() {
        return this.list.toString();
    }
}
