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
public class Honda implements Vehicle {

    @Override
    public void maju() {
        System.out.println("Honda Maju kedepan ");
    }

    @Override
    public void mundur() {
        System.out.println("Honda Mundur kebelakang");
    }

    @Override
    public double gerak(int jarak) {
        return jarak * 1.5;
    }

}
