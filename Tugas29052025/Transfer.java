package Tugas29052025;

public class Transfer extends Pembayaran implements MetodePembayaran {
    private String namaBank;

    public Transfer(double totalBayar, String namaBank) {
        super(totalBayar);
        this.namaBank = namaBank;
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode: Transfer Bank");
        System.out.println("Bank: " + namaBank);
    }

    @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Transfer:");
        System.out.println("1. Membuka aplikasi bank");
        System.out.println("2. Memasukkan nomor rekening");
        System.out.println("3. Transfer Rp" + totalBayar);
        System.out.println("Pembayaran selesai!");
    }
}