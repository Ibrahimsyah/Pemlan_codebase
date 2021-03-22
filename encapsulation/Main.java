/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import encapsulation.hewan.Kucing;

/**
 *
 * @author ibrahimsyah
 */
public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Kucing kucing1 = generator.buatKucing("Marco", 10);
        generator.printKucing(kucing1);
    }
}
