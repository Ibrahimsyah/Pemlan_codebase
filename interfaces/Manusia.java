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
public class Manusia {
    private Vehicle kendaraan;
    private String nama;

    public Manusia(Vehicle kendaraan, String nama) {
        this.kendaraan = kendaraan;
        this.nama = nama;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }

    public String getNama() {
        return nama;
    }
    
    //Tipe data abstract = Interface dan Abstract Class
    //Dia me reference ke Class yang mengextends / mengimplements abstract 
    public static void gunakanKendaraan(Vehicle vehicle){
        vehicle.maju();
        vehicle.mundur();
    }
    
    public static Vehicle buatVehicle(String merk){
        switch(merk){
            case "BMW" : return new BMW(2021);
            default : return new Honda();
        }
    }
    
    public static int getAngka(){
        int hasil = 2;
        return hasil;
    }
}
