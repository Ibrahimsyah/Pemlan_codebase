package polymorphism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimsyah
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing(2, 10); //Membuat objek kucing bertipe Kucing
        System.out.println(kucing);
        kucing.bergerak();
        kucing.makan();
        //Memanggil method lari dari class Kucing
        kucing.lari();
        kucing.bernafas();
        kucing.tidur();
        
        Iguana iguana = new Iguana(10, 32);
        System.out.println(iguana);
        iguana.makan();
        iguana.makan("Bakso");
        iguana.bergerak();
        iguana.bernafas();
        
        //Membuat Objek Kucing bertipe MakhlukHidup
        MakhlukHidup kitty = new Kucing(3, 5);
        kitty.tidur();
        kitty.bernafas();
        kitty.bergerak();
        kitty.makan();
        
        //Membuat Objek Iguana bertipe Reptil
        Reptil ig1 = new Iguana(3, 10);
        ig1.bergerak();
        ig1.makan("Es Doger");
        
        //Membuat Objek Iguana bertipe MakhlukHidup
        MakhlukHidup ig2 = new Iguana(4, 10);
        ig2.bergerak();
        ig2.bernafas();
        ig2.makan();
        ig2.tidur();
        
        PetHouse.treatMakhlukHidup(kucing);
        PetHouse.treatMakhlukHidup(ig1);
        
        
        
    }
}
