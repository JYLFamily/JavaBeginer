package com.company.generic;

/**
 * Created by puhui on 2018/7/22.
 */
public class SimpleColleaction<T> {

    private Object[] array;
    private int index;

    public SimpleColleaction() {
        this.array = new Object[10];
    }

    public SimpleColleaction(int capacity) {
        this.array = new Object[capacity];
    }

    public void add(T element) {
        this.array[index] = element;
        this.index = this.index + 1;
    }

    public T get(int index) {
        return (T) this.array[index];
    }

    public int size() {
        return this.index + 1;
    }

    public static void main(String[] args) {
        SimpleColleaction<Integer> sc = new SimpleColleaction<>();

        for (int i = 0; i < 10; i++) {
            sc.add(new Integer(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(sc.get(i));
        }
    }
}
