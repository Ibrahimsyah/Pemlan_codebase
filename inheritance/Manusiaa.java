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
public class Manusiaa {

    private String nama;
    private String kelamin;
    private int umur;

    public Manusiaa(String nama, String kelamin, int umur) {
        this.nama = nama;
        this.kelamin = kelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void makan() {
        System.out.println(this.nama + " sedang makan");
    }

    public void minum() {
        System.out.println(this.nama + " sedang minum");
    }
}
