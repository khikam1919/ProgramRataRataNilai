/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan21.programrataratanilai;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini berisi untuk menghitung rata-rata nilai dari sejumlah mahasiswa 
 * berdasarkan input nilai yang dimasukkan
 */
import java.util.Scanner;

public class SI23176014Latihan21ProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Deklarasi variabel untuk menyimpan total nilai
        double totalNilai = 0;

        // Loop untuk memasukkan nilai masing-masing mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;

        // Menampilkan hasil rata-rata nilai
        System.out.printf("Maka, Rata-rata Nilainya adalah %.2f\n", rataRata);

        // Menampilkan nama pengembang
        System.out.println("Developed by: Rizki Adam Kurniawan");

        scanner.close();
    }
}
