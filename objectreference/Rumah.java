/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreference;

/**
 *
 * @author ibrahimsyah
 */
public class Rumah {

    public static final String TIPE_KECIL = "kecil";
    public static final String TIPE_SEDANG = "sedang";
    public static final String TIPE_BESAR = "besar";

    private String alamatLengkap;
    private int harga;
    private String tipe;

    public Rumah(String alamatLengkap, int harga, String tipe) {
        this.alamatLengkap = alamatLengkap;
        this.harga = harga;
        this.tipe = tipe;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public int getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }
    
}
