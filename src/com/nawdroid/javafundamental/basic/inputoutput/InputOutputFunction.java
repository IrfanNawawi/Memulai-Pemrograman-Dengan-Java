package com.nawdroid.javafundamental.basic.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args){
        //Pemanggilan inisialisasi scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka pertama : ");

        //Mengambil data yg telah di masukan ke keyboard
        //scanner.nextInt : khusus untuk inputan integer, selain itu error klo beda type data
        int value1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : "+hasil);

        System.out.print("Masukkan nama : ");
        //scanner.next : untuk inputan semua type data
        String nama = scanner.next();
        System.out.print("Namanya adalah : "+nama);
    }
}
