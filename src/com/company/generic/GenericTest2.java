package com.company.generic;

/**
 * Created by puhui on 2018/7/22.
 */
public class GenericTest2<T1, T2> {

    private T1 member1;
    private T2 member2;

    public void setMember1(T1 member1) {
        this.member1 = member1;
    }

    public void setMember2(T2 member2) {
        this.member2 = member2;
    }

    public T1 getMember1() {
        return this.member1;
    }

    public T2 getMember2() {
        return this.member2;
    }

    public static void main(String[] args) {
        GenericTest2<Boolean, Integer> genericTest = new GenericTest2<>();

        genericTest.setMember1(new Boolean(true));
        genericTest.setMember2(new Integer(7));

        System.out.println(genericTest.getMember1());
        System.out.println(genericTest.getMember2());
    }
}
