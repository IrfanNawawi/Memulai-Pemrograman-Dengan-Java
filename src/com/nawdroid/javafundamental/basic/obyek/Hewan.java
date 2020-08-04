package com.nawdroid.javafundamental.basic.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat);
        System.out.println("Jumlah kaki Hewan : " + jumlahKaki);
    }
}
