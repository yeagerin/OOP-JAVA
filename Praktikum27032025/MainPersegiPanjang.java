package Praktikum27032025;

public class MainPersegiPanjang {

    public static void main(String[] args) {
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        System.out.println("Persegi Panjang 1:");
        System.out.println("Panjang: " + pp1.getPanjang() + ", Lebar: " + pp1.getLebar());
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println();

        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(5, 8);
        System.out.println("Persegi Panjang 2:");
        System.out.println("Panjang: " + pp2.getPanjang() + ", Lebar: " + pp2.getLebar());
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
        System.out.println();

        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi();
        pp3.setPanjang(10);
        pp3.setLebar(15);
        System.out.println("Persegi Panjang 3:");
        System.out.println("Panjang: " + pp3.getPanjang() + ", Lebar: " + pp3.getLebar());
        System.out.println("Luas: " + pp3.getLuas());
        System.out.println("Keliling: " + pp3.getKeliling());
        System.out.println();

        System.out.println("Total objek PersegiPanjang yang dibuat: " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}
