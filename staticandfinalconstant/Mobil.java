/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinalconstant;

/**
 *
 * @author Ibrahimsyah
 */
public class Mobil {
    public static final String BMW = "BMW";
    public static final String TESLA = "TESLA";
    public static final String HYUNDAI = "HYUNDAI";
    private static int penandaPlatNomor = 101;
    
    
    //Misal mobil pertama dapet plat 101
    //Mobil 2 dapet 103
    //Mobil 3 dapet 105
    
    private final String merk;
    private final int platNomor;

    public Mobil(String merk) {
        this.merk = merk;
        platNomor = penandaPlatNomor;
        penandaPlatNomor += 2;
    }

    public int getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }
}
