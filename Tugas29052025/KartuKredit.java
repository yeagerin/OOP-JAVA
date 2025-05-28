package Tugas29052025;

public class KartuKredit extends Pembayaran implements MetodePembayaran {
    public KartuKredit(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode: Kartu Kredit");
    }

    @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Kartu Kredit:");
        System.out.println("1. Gesek kartu di mesin EDC");
        System.out.println("2. Masukkan PIN");
        System.out.println("3. Transaksi Rp" + totalBayar + " berhasil");
        System.out.println("Pembayaran selesai!");
    }
}