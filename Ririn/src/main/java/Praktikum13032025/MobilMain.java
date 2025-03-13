/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum13032025;

public class MobilMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Lamborgini"; ///objek
        mobil1.plat = "BA 111 AL";
        mobil1.tahun = 2000;
        mobil1.warna = "Hitam";
        
        System.out.println("Merk mobil Anda             : "+mobil1.merk);
        System.out.println("No plat mobil Anda          : "+mobil1.plat);
        System.out.println("Tahun keluaran mobil Anda   : "+mobil1.tahun);
        System.out.println("Warna mobil Anda            : "+mobil1.warna);
        mobil1.MobilAktif(); ///method tanpa return
        System.out.println(mobil1.SuaraMobil()); ///method dengan return
        
        
    }
    
}
