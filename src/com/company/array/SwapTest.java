package com.company.array;

/**
 * Created by puhui on 2018/7/14.
 */
public class SwapTest {

    public void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 0;
        array[1] = 1;

        SwapTest st = new SwapTest();
        st.swap(array);

        System.out.println("array[0]: " + array[0]);
        System.out.println("array[1]: " + array[1]);
    }
}
