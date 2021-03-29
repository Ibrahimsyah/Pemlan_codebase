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
//Untuk copy atau duplicate Row di netbeans, bisa pencet
//  Shift + Ctrl + Arrow atas / bawah
//Untuk memindahkan Row di netbeans, bisa pencet
//  Shift + Alt + Arrow atas / bawah
public class Baju {

    //	- Denim
    //	- Levis
    //	- Jubah
    //	- Koko
    public static final String MERK_DENIM = "Denim";
    public static final String MERK_LEVIS = "Levis";
    public static final String MERK_JUBAH = "Jubah";
    public static final String MERK_KOKO = "Koko";

    private String merk;
    private int harga;

    public Baju(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }

    
    public static Baju[] buatBanyakBaju(
            int hargaAwal,
            int jumlahBaju,
            String merkBaju) {

        Baju[] hasil = new Baju[jumlahBaju];
        int hargaBaju = hargaAwal;
        for (int i = 0; i < hasil.length; ++i) {
            hasil[i] = new Baju(merkBaju, hargaBaju);
            hargaBaju += 10000;
        }
        System.out.println("Harga awal: " + hargaAwal);
        System.out.println("Harga baju: " + hargaBaju);
        return hasil;
    }
}
