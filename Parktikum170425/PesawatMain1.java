package Parktikum170425;

public class PesawatMain1 {

    public static void main(String[] args) {
        //buat objek pada class pesawat
        Pesawat p = new Pesawat("Air Asia", 2020, true, 130);
        System.out.println("Kondisi Awal");
        p.Cetak();
        
        System.out.println();
        
        System.out.println("Kondisi Setelah Reset");
        p.Reset("Lion Air", 1998, false, 80);
        p.Cetak();
    }
    
}
