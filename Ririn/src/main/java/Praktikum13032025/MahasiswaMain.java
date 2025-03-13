
package Praktikum13032025;

import java.util.Scanner;
public class MahasiswaMain {

    public static void main(String[] args) {
       int nimM;
       String namaM;
       int tugasM;
       int utsM;
       int uasM;
       int quizM;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan NIM Anda: ");
       nimM = input.nextInt();
       System.out.print("Masukkan Nama Anda: ");
       namaM = input.nextLine();
       input.nextInt();
       System.out.print("Masukkan Nilai Tugas Anda: ");
       tugasM = input.nextInt();
       System.out.print("Masukkan Nilai Uts Anda: ");
       utsM = input.nextInt();
       System.out.print("Masukkan Nilai UAS Anda: ");
       uasM = input.nextInt();
       System.out.print("Masukkan Nilai Quiz Anda: ");
       quizM = input.nextInt();
       
       Mahasiswa orang = new Mahasiswa (nimM, namaM, tugasM, utsM, uasM, quizM);
       System.out.println("-----Informasi Anda-----");
       orang.TampilData();
       
       System.out.println("-----Informasi Anda-----");
       orang.MenentukanNilaiAkhir(quizM);
       orang.KonversiNilai(nimM);
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
