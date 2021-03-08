/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordaninstancemethod;

/**
 *
 * @author ibrahimsyah
 */
public class Kucing {
    private String nama;
    private String warna;
    private String ras;
    private int tinggi;
    private int berat;

    public Kucing(String nama, String warna, String ras, int tinggi, int berat) {
        this.nama = nama;
        this.warna = warna;
        this.ras = ras;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public void tidur(){
        System.out.println(nama + " Sedang tidur");
    }
    
    //Instance method overload1
    public void makan(){
        System.out.println(nama + " Sedang makan");
    }
    
    //Instance method overload2
    public void makan(String makananKucing){
        System.out.println(nama + " Sedang makan " + makananKucing);
    }
    
    public int jarakLari(){
        //jarak = 2 * berat kucing
        return 2 * berat;
    }

    public String getNama() {
        return nama;
    }
}
