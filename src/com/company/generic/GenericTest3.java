package com.company.generic;

/**
 * Created by puhui on 2018/7/22.
 */
public class GenericTest3<T> {

    private GenericClass<T> gc;

    public void setGc(GenericClass<T> gc) {
        this.gc = gc;
    }

    public GenericClass<T> getGc() {
        return this.gc;
    }

    public static void main(String[] args) {
        GenericClass<Integer> gc = new GenericClass<>();
        GenericTest3<Integer> gt = new GenericTest3<>();

        gt.setGc(gc);
        gt.getGc();
    }
}


class GenericClass<T> {

}
