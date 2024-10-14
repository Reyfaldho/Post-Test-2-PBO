/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_sekolah.Manajemen;

public class Siswa extends Orang {
    private static int totalSiswa = 0;

    public Siswa(String nis, String nama, int usia) {
        super(nis, nama, usia);
        totalSiswa++;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("NIS: " + this.id + ", Nama: " + this.nama + ", Usia: " + this.usia);
    }

    public static int getTotalSiswa() {
        return totalSiswa;
    }

    public static void kurangiTotalSiswa() {
        if (totalSiswa > 0) {
            totalSiswa--;
        }
    }
}

