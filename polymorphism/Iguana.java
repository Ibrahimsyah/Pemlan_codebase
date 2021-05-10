/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ibrahimsyah
 */
public class Iguana extends Reptil {

    public Iguana(int umur, int jumlahGigi) {
        super(umur, jumlahGigi);
    }

    @Override
    public void makan(String makanan) {
        System.out.println("Iguana makan " + makanan);
    }

    @Override
    public void makan() {
        System.out.println("Iguana sedang makan");
    }

    @Override
    public String toString() {
        String result = "";
        result += "Umur: " + super.getUmur() + "\n";
        result += "Jumlah gigi: " + super.getJumlahGigi() + "\n";
        return result;
    }

}
