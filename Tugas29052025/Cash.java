package Tugas29052025;

public class Cash extends Pembayaran implements MetodePembayaran {
    public Cash(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode: Pembayaran Tunai");
    }

    @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Pembayaran Tunai:");
        System.out.println("1. Serahkan uang ke kasir");
        System.out.println("2. Tunggu kembalian jika ada");
        System.out.println("Pembayaran selesai!");
    }
}