package com.company.list;

public class LinkListTest2 {

    public static void main(String[] args) {
        Node2 node1 = new Node2("One");
        Node2 node2 = new Node2("Two");
        Node2 node3 = new Node2("Three");
        Node2 node4 = new Node2("Four");

        node1.setPrevious(node3);
        node1.setNext(node2);

        node2.setPrevious(node1);
        node2.setNext(node3);

        node3.setPrevious(node2);
        node3.setNext(node1);

        node1.insert(node4);
        System.out.println(node1.getNext());
        System.out.println(node4.getPrevious());
        System.out.println(node4.getNext());
        System.out.println(node2.getPrevious());

        node1.remove(node4);
        System.out.println(node1.getNext());
        System.out.println(node2.getPrevious());
        System.out.println(node4.getNext());
        System.out.println(node4.getPrevious());
    }
}

class Node2 {
    private Node2 previous = null;
    private Node2 next = null;
    private String data = null;

    Node2(String data) {
        this.data = data;
    }

    public String toString() {
        return this.data;
    }

    void setPrevious(Node2 node) {
        this.previous = node;
    }

    Node2 getPrevious() {
        return this.previous;
    }

    void setNext(Node2 node) {
        this.next = node;
    }

    Node2 getNext() {
        return this.next;
    }

    /***
     * 后插元素
     */
    void insert(Node2 node) {
        node.setNext(this.next);
        this.next.setPrevious(node);

        this.next = node;
        node.setPrevious(this);
    }

    /***
     * 删除后继元素
     */
    void remove(Node2 node) {
        node.getPrevious().setNext(node.getNext());
        node.getNext().setPrevious(node.getPrevious());

        // 以下要注意
        node.setNext(null);
        node.setPrevious(null);
    }
}
