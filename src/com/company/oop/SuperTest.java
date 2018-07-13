package com.company.oop;

public class SuperTest {
    public static void main(String[] args) {
        S s = new S();
        s.run();
    }
}

class SBaseClass {
    public void run() {
        System.out.println("SBaseClass");
    }
}

class S extends SBaseClass {
    public void run() {
        super.run();
        System.out.println("S");
    }
}