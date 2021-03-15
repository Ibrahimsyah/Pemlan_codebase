/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Generator {
    private String nama;

    public Generator(String nama) {
        this.nama = nama;
    }
    
    public String generate(){
        return "Halo " + nama + "!";
    }
    
    public String generate(int umur){
        return "Halo " + nama + ", kamu berumur " + umur + " tahun!";
    }
    
    public String generate(String namaBelakang){
        return "Halo " + nama + " " + namaBelakang;
    }
}
