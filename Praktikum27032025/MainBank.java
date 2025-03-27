package Praktikum27032025;

public class MainBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.tambahNasabah("Athink", "Hafith");
        bank.tambahNasabah("Rahmat", "Fitriana", new Tabungan(5000000));
        bank.tambahNasabah("Ririn", "Safitri", new Tabungan(10000000));
        bank.tambahNasabah("Nopla", "Hakim");
        
        System.out.println("=== Daftar Nasabah ===");
        for(int i = 0; i < bank.getJumlahNasabah(); i++) {
            System.out.println((i+1) + ". " + bank.getNasabah(i));
        }
        
        System.out.println("\n=== Pencarian Nasabah ===");
        int indexRahmat = bank.searchNasabah("Rahmat", "Fitriana");
        if(indexRahmat != -1) {
            System.out.println("Nasabah Rahmat Fitriana ditemukan di index: " + indexRahmat);
            
            Nasabah rahmat = bank.getNasabah(indexRahmat);
            rahmat.getTabungan().simpanUang(2000000);
            System.out.println("Saldo Rahmat setelah menabung: " + rahmat.getTabungan().getSaldo());
            
            boolean berhasilAmbil = rahmat.getTabungan().ambilUang(1000000);
            System.out.println("Penarikan 1.000.000 " + (berhasilAmbil ? "berhasil" : "gagal"));
            System.out.println("Saldo akhir Rahmat: " + rahmat.getTabungan());
        }
        
        System.out.println("\n=== Transfer Uang ===");
        Nasabah ririn = bank.getNasabah(bank.searchNasabah("Ririn", "Safitri"));
        Nasabah athink = bank.getNasabah(bank.searchNasabah("Athink", "Hafith"));
        
        if(ririn != null && athink != null) {
            if(athink.getTabungan() == null) {
                athink.setTabungan(new Tabungan(0));
            }
            
            boolean transferBerhasil = ririn.getTabungan().transfer(athink.getTabungan(), 3000000);
            System.out.println("Transfer 3.000.000 dari Ririn ke Athink " + 
                             (transferBerhasil ? "berhasil" : "gagal"));
            System.out.println("Saldo Ririn: " + ririn.getTabungan());
            System.out.println("Saldo Athink: " + athink.getTabungan());
        }
        
        System.out.println("\n=== Pencarian dengan Nama Depan 'Rin' ===");
        int[] hasilPencarian = bank.searchNasabah("Rin");
        for(int index : hasilPencarian) {
            System.out.println("Ditemukan: " + bank.getNasabah(index));
        }
        
        System.out.println("\n=== Informasi Akhir ===");
        System.out.println("Total nasabah: " + bank.getJumlahNasabah());
    } 
}