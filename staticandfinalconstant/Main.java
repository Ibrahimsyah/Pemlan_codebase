/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinalconstant;

/**
 *
 * @author Ibrahimsyah
 */
public class Main {
    public static void main(String[] args) {
        
        // Pemanasan
        int aNumber = 65;
        char aChar = (char)aNumber;
        System.out.println(aChar); // Outputnya apa nih?
        aChar++;
        System.out.println(aChar); // Ini juga apa hayo
        
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.PI);
        
        //<Tipe Data> <Nama Variable> = <Nilai awal>
        Mobil mobil = new Mobil(Mobil.BMW);
        System.out.println(mobil.getMerk());
        System.out.println(mobil.getPlatNomor());
        
        Mobil mobil2 = new Mobil(Mobil.TESLA);
        System.out.println(mobil2.getMerk());
        System.out.println(mobil2.getPlatNomor());
        
    }
}
