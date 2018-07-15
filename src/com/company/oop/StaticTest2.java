package com.company.oop;

/**
 * Created by puhui on 2018/7/8.
 */
public class StaticTest2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Aniaml animal = new Aniaml();
    }
}

class Aniaml {
    static {
        System.out.println("Animal Static Block !");
    }

    Aniaml() {
        System.out.println("Animal Constructor Method !");
    }
}

class Cat extends Aniaml {
    static {
        System.out.println("Cat Static Block !");
    }

    Cat() {
        System.out.println("Cat Constructor Method !");
    }
}
