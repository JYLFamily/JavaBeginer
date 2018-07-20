package com.company.list;

import java.util.LinkedList;

public class LinkListTest4 {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.put("Hello");
        mq.put("World");
        mq.put("FanCard");
        mq.put("Forever");

        System.out.println(mq);

        System.out.println(mq.get());
        System.out.println(mq.get());
        System.out.println(mq.get());
        System.out.println(mq.isEmpty());
        System.out.println(mq.get());
        System.out.println(mq.isEmpty());
    }
}


class MyQueue {
    private LinkedList list = null;

    MyQueue() {
        this.list = new LinkedList();
    }

    void put(Object o) {
        this.list.add(o);
    }

    Object get() {
        return this.list.removeFirst();
    }

    boolean isEmpty() {
        return this.list.size() == 0;
    }

    public String toString() {
        return this.list.toString();
    }
}