package com.nawdroid.javafundamental.basic.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[]args){
        // Harus inisialisasi BufferedReader dibantu InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program sederhana");
        int value1 = 0;
        int value2 = 0;

        /*
        * Namun sedikit berbeda dengan implementasi Scanner,
        * tambahkan ioException sebagai penanganan error input pada BufferedReader.
        * Selain itu untuk menyimpan pada sebuah variabel,
        * data yang diberikan oleh BufferedReader harus kita parsing terlebih dahulu
        */

        try{
            System.out.print("Masukan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
            /*
            * bila ingin menyimpan data pada int
            * maka nilai yang ada pada bufferedReader.readLine()
            * harus dikonversi dahulu ke dalam bentuk integer
            * menggunakan Integer.parseInt.
            */
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : "+ hasil);
    }
}
