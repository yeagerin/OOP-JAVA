package Parktikum170425;

public class Kendaraan {
    private String nama;
    private int tahunProduksi;
    
    public Kendaraan(){
        
    }
    public Kendaraan(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public void Cetak(){
        System.out.println("Nama Kendaraan "+nama);
        System.out.println("Tahun Produksi "+tahunProduksi);
    }
    
}
