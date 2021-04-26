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
public class Hewan {

    private int berat;
    private int umur;

    public Hewan(int berat, int umur) {
        this.berat = berat;
        this.umur = umur;
    }

    public int getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }

    public void makan() {
        System.out.println("Hewan sedang makan");
    }

    public void bergerak() {
        System.out.println("Hewan sedang bergerak");
    }

    @Override
    public String toString() {
        String result = "";
        result += "Berat: " + this.berat + "\n";
        result += "Umur: " + this.umur + "\n";
        
        return result;
    }
}
