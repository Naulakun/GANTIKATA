/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal12;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : GANTI KATA
 */
import java.util.Scanner;

public class SOAL12 {
    public static void main(String[] args) {
        //HEADER PROGRAM
        System.out.println("=== Program Mengganti Kata ===");
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kalimat
        System.out.print("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();

        // Meminta pengguna untuk memasukkan kata yang akan diganti
        System.out.print("Ganti Kata : ");
        String kataLama = scanner.nextLine();

        // Meminta pengguna untuk memasukkan kata pengganti
        System.out.print("Menjadi Kata : ");
        String kataBaru = scanner.nextLine();

        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        // Menampilkan hasil kalimat baru
        System.out.println("");
        System.out.println("=== Hasil Formatting ===");
        System.out.println();
        System.out.println("Kalimat Awal: " + kalimat);
        System.out.println("Kalimat Baru : " + kalimatBaru);

        // Menutup scanner
        scanner.close();
    }
}

