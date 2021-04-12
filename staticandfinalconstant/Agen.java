/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinalconstant;

/**
 *
 * @author ibrahimsyah
 */
public class Agen {
    private static int nomorSeriTambahan = 100;
    
    public static Ponsel[] prosesPonsel(Ponsel[] kumpulanPonsel){
        Ponsel[] hasil = kumpulanPonsel;
        for(Ponsel ponsel : hasil){
            ponsel.setNomorSeri(ponsel.getNomorSeri() + nomorSeriTambahan);
            nomorSeriTambahan += 3;
        }
        return hasil;
    }
}
