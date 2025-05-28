package Tugas29052025;

public class EWallet extends Pembayaran implements MetodePembayaran {
    public EWallet(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode: E-Wallet");
    }

    @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses E-Wallet:");
        System.out.println("1. Buka aplikasi e-wallet");
        System.out.println("2. Scan QR code");
        System.out.println("3. Bayar Rp" + totalBayar);
        System.out.println("Pembayaran selesai!");
    }
}