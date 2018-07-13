package com.company.array;

public class ArrayTest3 {

    public static void main(String[] args) {
        int base = 1;
        int[][] array = new int[2][3];



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 2 * base;
                base = base + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}

