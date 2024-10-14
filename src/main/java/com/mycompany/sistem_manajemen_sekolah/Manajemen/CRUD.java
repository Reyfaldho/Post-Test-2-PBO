/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_sekolah.Manajemen;

public interface CRUD<T> {
    void tambah(T t);
    void tampilkanSemua();
    void hapus(String id);
    void update(String id, T t);
}