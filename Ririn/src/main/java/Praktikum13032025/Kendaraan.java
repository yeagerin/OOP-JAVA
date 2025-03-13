
package Praktikum13032025;


public class Kendaraan {
    String jenis;
    int tahun;
    String warna;
    
    ///deklarasi constructor
    public Kendaraan (String j, int t, String w){
        this.jenis=j; //this untuk constructor 
        this.tahun=t;
        this.warna=w;
        
        
        
    }
    
    ///method untuk menampilkan data
    public void TampilData(){
        System.out.println("Jenis Kendaraan: "+jenis);
        System.out.println("Tahun Keluaran : "+tahun);
        System.out.println("Warna Kendaraan: "+warna);
    }
    
    ///method dengan parameter
    public void TipeKendaraan(int kec){
        System.out.println("Tipe Kendaraan Anda: "+kec);
        if (kec < 20){
            System.out.println("Anda membuat macet saja.");
            System.out.println("Tambah kecepatan atau ganti kendaraan!");
        }
        else if (kec <=40)
            System.out.println("Terlalu lambat");
        else if (kec <=80)
            System.out.println("Kecepatan Anda normal");
        else if (kec <100)
            System.out.println("Kecepatan Anda tinggi");
        else 
            System.out.println("Kecepatan Anda diatas rata-rata, bahaya!!!");
    }
    
}
