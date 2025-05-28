package Tugas29052025;

import java.util.Scanner;

public class MainPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Sistem Pembayaran ===");
            
            double totalBayar;
            while (true) {
                System.out.print("Masukkan total bayar (minimal Rp 1000): Rp ");
                totalBayar = input.nextDouble();
                input.nextLine();
                
                if (totalBayar >= 1000) {
                    break;
                }
                System.out.println("Maaf, minimal pembayaran adalah Rp1000");
            }
            
            System.out.println("\nPilih metode pembayaran:");
            System.out.println("1. Transfer");
            System.out.println("2. Cash");
            System.out.println("3. E-Wallet");
            System.out.println("4. Kartu Kredit");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            Pembayaran metodePembayaran;
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan nama bank: ");
                    String namaBank = input.nextLine();
                    metodePembayaran = new Transfer(totalBayar, namaBank);
                    break;
                case 2:
                    metodePembayaran = new Cash(totalBayar);
                    break;
                case 3:
                    metodePembayaran = new EWallet(totalBayar);
                    break;
                case 4:
                    metodePembayaran = new KartuKredit(totalBayar);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }
            
            System.out.println("\n=== Detail Pembayaran ===");
            metodePembayaran.pilihMetode();
            System.out.println("Total: Rp" + totalBayar);
            
            System.out.println("\n=== Proses Pembayaran ===");
            ((MetodePembayaran)metodePembayaran).displayProsesPembayaran();
            
            System.out.print("\nLakukan pembayaran lagi? (y/n): ");
            String jawaban = input.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                System.out.println("\nTerima kasih telah menggunakan sistem pembayaran!");
                break;
            }
        }
    }
}