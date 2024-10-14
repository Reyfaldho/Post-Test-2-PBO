/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_sekolah.Manajemen;


public abstract class Orang {
    protected final String id;
    protected String nama;
    protected int usia;

    public Orang(String id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}

