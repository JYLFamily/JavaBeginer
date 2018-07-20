package com.company.set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetTest2 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new MyComparator2());

        set.add(new Student(10));
        set.add(new Student(20));
        set.add(new Student(30));

        for (Iterator iter = set.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}

class Student {
    int score;

    Student(int score) {
        this.score = score;
    }

    public String toString() {
        return String.valueOf(this.score);
    }
}

class MyComparator2 implements Comparator {

    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.score > s2.score) {
            return 1;
        } else if (s1.score == s2.score) {
            return 0;
        } else {
            return -1;
        }
    }
}
