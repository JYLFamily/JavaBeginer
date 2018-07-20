package com.company.set;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        Person p1 = new Person("110105");
        Person p2 = new Person("110105");

        HashSet set = new HashSet();

        set.add(p1);
        set.add(p2);

        System.out.println(p1.equals(p2));
        System.out.println(set);
    }
}


class Person {
    private Integer idNo;

    Person(String idNo) {
        this.idNo = new Integer(idNo);
    }

    public int hashCode() {
        return this.idNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Person) {
            Person person = (Person) obj;

            if (this.idNo.equals(person.idNo)) {
                return true;
            }
        }

        return false;
    }
}