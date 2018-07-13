package com.company.oop;

import com.company.another.AccessTestBaseClass;

public class AccessTest extends AccessTestBaseClass {

    public static void main(String[] args) {
        AccessTest at = new AccessTest();
        at.run();
        System.out.println(at.flag);

        System.out.println(at instanceof AccessTestBaseClass);
        System.out.println(at instanceof AccessTest);
    }
}


