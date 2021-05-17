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
public class BMW implements Vehicle, RaceCar {
    private int keluaran;

    public BMW(int keluaran) {
        this.keluaran = keluaran;
    }
    
    @Override
    public void maju() {
        System.out.println("BMW Maju kedepan ");
    }

    @Override
    public void mundur() {
        System.out.println("BMW Mundur kebelakang");
    }

    @Override
    public double gerak(int jarak) {
       return jarak * 0.5;
    }

    @Override
    public void boost() {
        System.out.println("BMW is boosting");
    }

    @Override
    public double turbo(int kecepatanAwal) {
        return kecepatanAwal * 2.0;
    }
    
}
