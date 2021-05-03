/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Pegawai {
    //NIP, nama, tahunMasuk, dan kelamin
    private String NIP;
    private String nama;
    private int tahunMasuk;
    private String kelamin;

    public Pegawai(String NIP, String nama, int tahunMasuk, String kelamin) {
        this.NIP = NIP;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.kelamin = kelamin;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void bekerja(){
        System.out.println("Pekerja sedang bekerja");
    }
    
    public void istirahat(){
        System.out.println("Pekerja sedang istirahat");
    }

    @Override
    public String toString() {
        String result = "";
        result += "Nama: " + nama + "\n";
        result += "NIP: " + NIP + "\n";
        result += "Tahun Masuk: " + tahunMasuk + "\n";
        result += "Kelamin: " + kelamin + "\n";
        return result;
    }
    
}