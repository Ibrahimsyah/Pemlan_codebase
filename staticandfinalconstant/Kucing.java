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
public class Kucing {
    public static final String RAS_CIHUAHUA = "Cihuahua";
    public static final String RAS_PERSIA = "Persia";
    public static int nomorIdentitasKucing = 1000;
    
    private final String ras;
    private final int nomorKalung;

    public Kucing(String ras) {
        this.ras = ras;
        nomorKalung = nomorIdentitasKucing;
        nomorIdentitasKucing += 5;
    }

    public String getRas() {
        return ras;
    }

    public int getNomorKalung() {
        return nomorKalung;
    }
    
    
    public static void cetakInfoKucing(Kucing kucing){
        System.out.printf("Ras: %s\n", kucing.getRas());
        System.out.printf("Nomor Kalung: %s\n", kucing.getNomorKalung());
    }
}
