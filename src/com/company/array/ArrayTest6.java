package com.company.array;

import java.util.Arrays;

/**
 * Created by puhui on 2018/7/14.
 */
public class ArrayTest6 {
    public boolean equals(int[] array1, int[] array2) {
        // 对 null 调用任何方法都会报错
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1 == array2) {
            return true;
        }

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayTest6 at = new ArrayTest6();

        int[] a = {1, 2, 3};
        int[] b = a;

        System.out.println(at.equals(a, b));
        System.out.println(Arrays.equals(a, b));

    }
}
