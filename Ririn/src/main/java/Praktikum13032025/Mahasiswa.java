
package Praktikum13032025;

public class Mahasiswa {
    int nim;
    String nama;
    int tugas;
    int uts;
    int uas;
    int quiz;
    double nilaiAkhir;

    public Mahasiswa (int nim, String n, int t, int uts, int uas, int q){
        this.nim = nim;
        this.nama = n; 
        this.tugas = t;
        this.uts = uts;
        this.uas = uas;
        this.quiz = q ;
    }
    
     public void TampilData(){
        System.out.println("Nim Anda: "+nim);
        System.out.println("Nama Anda : "+nama);
        System.out.println("Nilai Tugas Anda: "+tugas);
        System.out.println("Nilai UTS Anda: "+uts);
        System.out.println("Nilai UAS Anda : "+uas);
        System.out.println("Nilai Quiz Anda: "+quiz);
    }
     
     public void MenentukanNilaiAkhir (int akhir){
        System.out.println("Nilai Akhir Anda (angka): "+nilaiAkhir);
        nilaiAkhir = 0.15*tugas + .2*quiz + .3*uts + .25*uas;
    }
     
     public void KonversiNilai (int nilai){
        System.out.println("Nilai Akhir Anda (huruf): "+nilaiAkhir);
        if (nilaiAkhir >= 80)
            System.out.println("A");
        else if (nilaiAkhir <80)
            System.out.println("B");
        else if (nilaiAkhir <=64)
            System.out.println("C");
        else if (nilaiAkhir <=49)
            System.out.println("D");
        else 
            System.out.println("E");
    }
}
            
    

