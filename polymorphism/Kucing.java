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
public class Kucing extends MakhlukHidup{
    private int berat;
    
    public Kucing(int umur, int berat) {
        super(umur);
        this.berat = berat;
    }

    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak menggunakan 4 kaki");
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan ikan");
    }
    
    public void lari(){
        System.out.println("Kucing sedang berlari");
    }

    @Override
    public String toString() {
        String result = "";
        result += "Umur: " + super.getUmur() + "\n";
        result += "Berat: " + berat + "\n";
        return result;
    }
    
    
}
