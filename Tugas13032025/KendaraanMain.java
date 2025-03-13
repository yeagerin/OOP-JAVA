
package Tugas13032025;


import java.util.Scanner;
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jns; ///atribut classutama
        int thn;
        String wrn;
        int v;
        
        Scanner in = new Scanner(System.in);
        ///meminta input
        System.out.print("Masukkan jenis kendaraan: ");
        jns = in.nextLine();
        System.out.print("Tahun Keluaran: ");
        thn = in.nextInt();
        in.nextLine(); ///jika dibawah juga menginput tipe data yang sama maka tambahkan ini agar yang dibawah terbaca
        System.out.print("Warna kendaraan: ");
        wrn = in.nextLine();
        
        ///deklarasi objek
        Kendaraan mobil1 = new Kendaraan(jns, thn, wrn);
        System.out.println("\n---Informasi Kendaraan 1---");
        mobil1.TampilData();
        
        ///input data kecepatan kendaraan
        System.out.print("Masukkan data kecepatan max per km kendaraan Anda: ");
        v = in.nextInt();
        mobil1.TipeKendaraan(v);
    }
    
}
