/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Pekerjaa extends Manusiaa {

    private String NIP;
    private int gaji;

    public Pekerjaa(String NIP, int gaji, String nama, String kelamin, int umur) {
        super(nama, kelamin, umur);
        this.NIP = NIP;
        this.gaji = gaji;
    }

    public void bekerja() {
        System.out.println(super.getNama() + " sedang bekerja");
    }

    @Override
    public void makan() {
        System.out.println("Pekerja " + super.getNama() + " sedang makan");
    }

    @Override
    public void minum() {
        System.out.println("Pekerja " + super.getNama() + " sedang minum");
    }
    
    public void manusiaMakan(){
        super.makan();
    }
}
