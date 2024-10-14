/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_sekolah.Manajemen;
import java.util.ArrayList;

public final class Kelas implements CRUD<Siswa> {
    private final String namaKelas;
    private String waliKelas;
    private ArrayList<Siswa> daftarSiswa;

    // Constructor
    public Kelas(String namaKelas, String waliKelas) {
        this.namaKelas = namaKelas;
        this.waliKelas = waliKelas;
        this.daftarSiswa = new ArrayList<>();
    }

    // Implementasi method tambah dari interface CRUD
    @Override
    public void tambah(Siswa siswa) {
        daftarSiswa.add(siswa);
        System.out.println("Siswa " + siswa.getNama() + " berhasil ditambahkan ke kelas " + this.namaKelas);
    }

    // Implementasi method tampilkanSemua dari interface CRUD
    @Override
    public void tampilkanSemua() {
        System.out.println("Daftar siswa di kelas " + this.namaKelas + ":");
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada siswa yang terdaftar.");
        } else {
            for (Siswa siswa : daftarSiswa) {
                siswa.tampilkanInfo();
            }
        }
    }

    // Implementasi method hapus tanpa Iterator
    @Override
    public void hapus(String nis) {
        boolean ditemukan = false;

        // Menggunakan perulangan biasa untuk mencari siswa berdasarkan NIS
        for (int i = 0; i < daftarSiswa.size(); i++) {
            Siswa siswa = daftarSiswa.get(i);
            if (siswa.getId().equals(nis)) {
                daftarSiswa.remove(i); // Menghapus siswa langsung menggunakan index
                Siswa.kurangiTotalSiswa(); // Kurangi total siswa setelah penghapusan
                System.out.println("Siswa dengan NIS " + nis + " berhasil dihapus.");
                ditemukan = true;
                break; // Keluar dari loop setelah menemukan dan menghapus siswa
            }
        }

        if (!ditemukan) {
            System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }

    // Implementasi method update dari interface CRUD
    @Override
    public void update(String nis, Siswa siswaBaru) {
        boolean ditemukan = false;

        // Menggunakan for-each loop untuk mencari dan mengupdate data siswa
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getId().equals(nis)) {
                siswa.setNama(siswaBaru.getNama());
                siswa.setUsia(siswaBaru.getUsia());
                System.out.println("Data siswa dengan NIS " + nis + " berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }
}
