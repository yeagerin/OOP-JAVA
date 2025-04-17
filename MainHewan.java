package Praktikum17042025;

public class MainHewan {

    public static void main(String[] args) {
        //pembuatan objek
        Hewan hewanku = new Hewan("Makhluk hidup");
        Kucing kucingku = new Kucing("Bobby");
        Anjing anjingku = new Anjing("Helly");
        
        //mengakses super class
        System.out.println("Tampilan akses super class Hewan"); 
        hewanku.tampilNama();
        hewanku.bersuara();
        
        //mengakses sub class Kucing
        System.out.println("Tampilan akses sub class Kucing");
        kucingku.tampilNama();
        kucingku.bersuara();
        
        //mengkases sub class Anjing
        System.out.println("Tampilan akses sub class Anjing");
        anjingku.tampilNama();
        anjingku.bersuara();
    }
    
}
