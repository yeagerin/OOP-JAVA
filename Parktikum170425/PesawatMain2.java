package Parktikum170425;

public class PesawatMain2 {

    public static void main(String[] args) {
        // buat objek bertipe array
        int i;
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        daftarPesawat[0] = new Pesawat("Air Asia", 2015, true, 180);
        daftarPesawat[1] = new Pesawat("Lion Air", 2018, false, 100);
        daftarPesawat[2] = new Pesawat("Merpati", 2010, true, 75);
        
        System.out.println("DAFTAR PESAWAT\n");
        for(i=0; i<daftarPesawat.length; i++){
            System.out.println("\nData Pesawat ke "+(i+1)+ "==");
            daftarPesawat[i].Cetak();
            System.out.println();
        }
    }
    
}
