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
    
    // Jamboard
    // https://jamboard.google.com/d/1badB08Q3_aTBb-EgTSmnMkevjBUPyI1FEG2mPXFSXYg/edit?usp=sharing
    public static void main(String[] args) {
        Generator generator = new Generator();
        Kucing kucing1 = generator.buatKucing("Marco", 10);
        generator.printKucing(kucing1);
    }
}
