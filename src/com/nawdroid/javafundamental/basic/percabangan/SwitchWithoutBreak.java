package com.nawdroid.javafundamental.basic.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[]args){
        char input = 'C';
        int output = 0;
        switch (input){
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);

        // output = 4
        /*
        * Karena pada proses case diatas tanpa break akan menjalankan semua
        * kode setelah case yg terpilih. yang artinya akan memproses dari awal case
        * sampai mendapatkan case yg sesuai
        */
    }
}
