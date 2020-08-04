package com.nawdroid.javafundamental.basic.array;

public class LoopingArray {
    public static void main (String[]args){
        int[] arrInt = new int[1000000];

        for (int x = 0; x < arrInt.length; x++){
            // arrInt[x] : untuk menambahkan nilai setiap kali kondisi for terpenuhi, lalu menuliskan outputnya
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
