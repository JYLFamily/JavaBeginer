package com.company.strategy;

import java.util.Comparator;
import java.util.LinkedList;

public class StrategyTest2 {

    public static void main(String[] args) {
        Person p3 = new Person(new Integer(3), new Integer(15), "JJ");
        Person p4 = new Person(new Integer(4), new Integer(18), "JH");
        Person p1 = new Person(new Integer(1), new Integer(10), "JYL");
        Person p2 = new Person(new Integer(2), new Integer(10), "JYF");
        LinkedList list = new LinkedList();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        list.sort(new MyComparatorAge());

        System.out.println(list);
    }
}

class Person {
    Integer id;
    Integer age;
    String name;

    Person(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "id: " + this.id + " age: " +this.age + " name: " + this.name;
    }
}

/***
 * 年龄从小到大
 * 年龄相同，id 从小到大
 */
class MyComparatorAge implements Comparator {

    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;

        if (p1.age.compareTo(p2.age) == 0) {
            return p1.id.compareTo(p1.id);
        } else {
            return p1.age.compareTo(p2.age);
        }
    }
}