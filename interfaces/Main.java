/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ibrahimsyah
 */
public class Main {
    public static void main(String[] args) {
        BMW bmw1 = new BMW(2001);
        System.out.println(bmw1.gerak(10));
        bmw1.maju();
        bmw1.mundur();
        bmw1.boost();
        System.out.println(bmw1.turbo(100));
        
        Honda honda1 = new Honda();
        honda1.maju();
        honda1.mundur();
        
        Manusia hooman1 = new Manusia(honda1, "Budi");
        
        Manusia.gunakanKendaraan(bmw1);
        
        Vehicle hasilBMW = Manusia.buatVehicle("BMW");
        Vehicle hasilHonda = Manusia.buatVehicle("honda");
        
        hasilBMW.maju();
        hasilHonda.maju();
        
        Manusia.getAngka();
    }
}
