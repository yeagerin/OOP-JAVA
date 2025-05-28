package Tugas29052025;

public abstract class Pembayaran {
    protected double totalBayar;

    public Pembayaran(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public abstract void pilihMetode();
}