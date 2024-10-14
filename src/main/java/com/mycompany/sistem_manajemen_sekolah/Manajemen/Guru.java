/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_sekolah.Manajemen;


public class Guru extends Orang {
    private String mataPelajaran;

    public Guru(String nip, String nama, int usia, String mataPelajaran) {
        super(nip, nama, usia);
        this.mataPelajaran = mataPelajaran;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("NIP: " + this.id + ", Nama: " + this.nama + ", Usia: " + this.usia + ", Mata Pelajaran: " + this.mataPelajaran);
    }
}
