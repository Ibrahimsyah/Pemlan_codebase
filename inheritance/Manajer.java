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
public class Manajer extends Pekerja {

    private String department;

    public Manajer(String department,
            String NIP,
            int gaji,
            String nama,
            String kelamin,
            int umur) {
        super(NIP, gaji, nama, kelamin, umur);
        this.department = department;
    }

    public void rapat() {
        System.out.println("Manajer sedang rapat");
    }

    @Override
    public void makan() {
        System.out.println("Manajer sedang makan");
    }

    public void test() {
        super.makan();
    }
}
