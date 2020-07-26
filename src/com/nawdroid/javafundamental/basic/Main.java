package com.nawdroid.javafundamental.basic;

/* Baris import dapat di sederhanakan classnya
 *  dengan simbol * asalkan masih dalam 1 package
 */

import com.nawdroid.javafundamental.basic.kendaraan.*;

import com.nawdroid.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tommorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tommorrow);
    }
}

/*
 * Penggunaan wildcard (*) kadang tidak disarankan
 * jika class di dalam package tersebut terlalu banyak.
 * Sebabnya, ia memperlama waktu untuk pencarian class tersebut.
 * Untuk itu kita serahkan ke IntelliJ mengatur import yang optimal.
 * Pilih menu Code | Optimize Imports.
 * Baris import akan kembali ke sebelumnya tanpa menggunakan wildcard (*).
 */
