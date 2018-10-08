/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan nilai besar dan kecil berdasarkan (OO)
 */
public class nilaiBesarKecil {

    public int BanyakMHS;
    public int[] nilai = new int[20];

    public int j = 1;

    public void hitungBnykMHS(int n) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < n) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ":");
            nilai[i] = sc.nextInt();
            i = i + 1;
        }
    }

    public void tampilNilai(int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Hasil Nilai Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }

        int min = nilai[1];
        int max = nilai[1];

        for (i = 0; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
            System.out.println("\nNilai terbesar : " + max);
            System.out.println("Nilai terkecil : " + min);
        }

    }
}
