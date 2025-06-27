package Tugas260625;

public class Saldo {
    private static double saldo = 1000000;
    
    public static double getSaldo() {
        return saldo;
    }
    
    public static void setSaldo(double newSaldo) {
        saldo = newSaldo;
    }
    
    public static void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }
    
    public static void kurangiSaldo(double jumlah) {
        saldo -= jumlah;
    }
}