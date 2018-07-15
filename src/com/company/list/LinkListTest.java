package com.company.list;

/**
 * Created by puhui on 2018/7/15.
 */
public class LinkListTest {

    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("C");
        Node node3 = new Node("D");
        Node node4 = new Node("B");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(null);
        node1.insert(node4);
        node1.delete(node4);

        System.out.println(node1.getNext().getNext());
    }
}


class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;

    }

    public String toString() {
        return data;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getNext() {
        return next;
    }

    void insert(Node node) {
        Node temp = null;
        temp = this.next;
        this.next = node;
        node.next = temp;
    }

    void delete(Node node) {
        this.next = node.getNext();
        node.setNext(null);
    }
}