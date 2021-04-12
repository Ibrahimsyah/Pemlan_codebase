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
public class Ponsel {

    public static final String MERK_NAKIO = "NAKIO";
    public static final String MERK_SUMSANG = "SUMSANG";
    public static final String MERK_SYNO = "SYNO";
    public static final String MERK_XAIOMI = "XAIOMOI";

    private static char akhiranSeri = 'A';
    private static int awalanSeri = 1;

    private String merk;
    private String nomorSeri;

    public Ponsel(String merk) {
        this.merk = merk;
        this.nomorSeri = awalanSeri + "" + akhiranSeri;
        awalanSeri += 2;
        if(akhiranSeri == 'E'){
            akhiranSeri = 'A';
        }else{
            akhiranSeri ++;
        }
    }

    public String getNomorSeri() {
        return nomorSeri;
    }

    public void setNomorSeri(String nomorSeri) {
        this.nomorSeri = nomorSeri;
    }

    public void cetakInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Nomor Seri: " + this.nomorSeri);
        System.out.println("=============================");
    }
}
