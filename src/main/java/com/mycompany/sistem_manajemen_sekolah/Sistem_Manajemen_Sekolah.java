/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_manajemen_sekolah;
import com.mycompany.sistem_manajemen_sekolah.Manajemen.*;
import java.util.Scanner;
/**
 *
 * @author Acer GK
 */
public class Sistem_Manajemen_Sekolah {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kelas kelas = new Kelas("X IPA 1", "Budi");

        boolean running = true;
        while (running) {
            System.out.println("\n--- Sistem Manajemen Sekolah ---");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Tampilkan Daftar Siswa");
            System.out.println("3. Hapus Siswa");
            System.out.println("4. Update Data Siswa");
            System.out.println("5. Tampilkan Total Siswa");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menangkap enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIS: ");
                    String nis = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Usia: ");
                    int usia = scanner.nextInt();

                    Siswa siswaBaru = new Siswa(nis, nama, usia);
                    kelas.tambah(siswaBaru);
                    break;

                case 2:
                    kelas.tampilkanSemua();
                    break;

                case 3:
                    System.out.print("Masukkan NIS siswa yang akan dihapus: ");
                    String nisHapus = scanner.nextLine();
                    kelas.hapus(nisHapus);
                    break;

                case 4:
                    System.out.print("Masukkan NIS siswa yang akan diupdate: ");
                    String nisUpdate = scanner.nextLine();
                    System.out.print("Masukkan Nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Usia baru: ");
                    int usiaBaru = scanner.nextInt();
                    Siswa siswaUpdate = new Siswa(nisUpdate, namaBaru, usiaBaru);
                    kelas.update(nisUpdate, siswaUpdate);
                    break;

                case 5:
                    System.out.println("Total Siswa: " + Siswa.getTotalSiswa());
                    break;

                case 6:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
