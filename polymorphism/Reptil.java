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
public abstract class Reptil extends MakhlukHidup {
    private int jumlahGigi;

    public Reptil(int umur, int jumlahGigi) {
        super(umur);
        this.jumlahGigi = jumlahGigi;
    }
    
    public abstract void makan(String makanan);
    
    @Override
    public void bergerak(){
        System.out.println("Reptil sedang bergerak");
    }
    
    public int getJumlahGigi(){
        return jumlahGigi;
    }
}
