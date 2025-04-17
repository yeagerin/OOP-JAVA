package Parktikum170425;

import java.util.Scanner;

public class PesawatMain3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0; 
        Pesawat[] daftarPesawat = new Pesawat[0]; 
        boolean menu = true;

        while (menu) { 
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Data Pesawat");
            System.out.println("2. Tampilkan Semua Data Pesawat");
            System.out.println("3. Cari Pesawat dengan Muatan Terbesar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    // Input data pesawat
                    System.out.println("Input Data Pesawat Baru:");
                    System.out.print("\tNama Pesawat = ");
                    String nama = input.nextLine();
                    System.out.print("\tTahun Produksi = ");
                    int tahunProduksi = input.nextInt();
                    System.out.print("\tMenggunakan Mesin? (true/false) = ");
                    boolean mesin = input.nextBoolean();
                    System.out.print("\tJumlah Maksimum Penumpang = ");
                    int muatan = input.nextInt();
                    input.nextLine(); 

                    Pesawat[] temp = new Pesawat[jumlah + 1];
                    for (int i = 0; i < jumlah; i++) {
                        temp[i] = daftarPesawat[i];
                    }
                    temp[jumlah] = new Pesawat(nama, tahunProduksi, mesin, muatan);
                    daftarPesawat = temp;
                    jumlah++;

                    System.out.println("Data pesawat berhasil ditambahkan.");
                    break;

                case 2:
                    // Tampilkan semua data pesawat
                    if (jumlah == 0) {
                        System.out.println("Belum ada data pesawat yang dimasukkan.");
                    } else {
                        System.out.println("\n=== DAFTAR PESAWAT ===");
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("\nData Pesawat ke-" + (i + 1) + ":");
                            daftarPesawat[i].Cetak();
                        }
                    }
                    break;

                case 3:
                    // Cari pesawat dengan muatan terbesar
                    if (jumlah == 0) {
                        System.out.println("Belum ada data pesawat yang dimasukkan.");
                    } else {
                        int max = daftarPesawat[0].getMuatan();
                        String namaMax = daftarPesawat[0].getNama();

                        for (int i = 1; i < jumlah; i++) {
                            if (daftarPesawat[i].getMuatan() > max) {
                                max = daftarPesawat[i].getMuatan();
                                namaMax = daftarPesawat[i].getNama();
                            }
                        }

                        System.out.println("Pesawat dengan muatan terbesar adalah " + namaMax);
                        System.out.println("dengan kapasitas " + max + " orang.");
                    }
                    break;

                case 4:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    menu = false; 
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}