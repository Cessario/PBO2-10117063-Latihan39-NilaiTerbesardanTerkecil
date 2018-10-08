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
Deskripsi Program : Menampilkan nilai terbesar dan terkecil berdasarkan (OO)
 */
public class PBO210117063Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        int n;
        
        nilaiBesarKecil nbk = new nilaiBesarKecil();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil=====");
        System.out.print("Masukkan Nama Petugas : ");
        kalimat = sc.nextLine();
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        n = sc.nextInt();
        nbk.hitungBnykMHS(n);
        System.out.println("\n=====Hasil Nilai Mahasiswa====");
        nbk.tampilNilai(n);
        
        
    }
    
}
