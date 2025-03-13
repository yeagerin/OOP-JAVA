/*

 */
package Praktikum13032025;

public class Mobil {
    ///definisi class Mobil dengan atribut
    String warna;
    String merk;
    int tahun;
    String plat;
    
    ///method tanpa return
    public void MobilAktif(){
        System.out.println("Ready...Go!");
    }
    

    ///method dengan return
    String SuaraMobil(){
        return "Brummm!";
    }
}


