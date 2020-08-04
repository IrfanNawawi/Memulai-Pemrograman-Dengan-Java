package com.nawdroid.javafundamental.basic.array;

public class InisialisasiArray {
    public static void main (String[] args) {
        // Cara pertama inisialisasi array
        int[] arrInt = new int[]{1,2,3,4,5,6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        System.out.println("");
        System.out.println("");

        // Cara kedua inisialisasi array
        int[] arrInt2 = new int[6];
        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);

        // Cara ketiga inisialisasi array (menghilangkan new + tipe data)
        int [] arrInt3 = {1,2,3,4,5,6};

        System.out.println(arrInt3[0]);
        System.out.println(arrInt3[1]);
        System.out.println(arrInt3[2]);
        System.out.println(arrInt3[3]);
        System.out.println(arrInt3[4]);
        System.out.println(arrInt3[5]);
    }
}
