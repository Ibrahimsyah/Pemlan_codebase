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
public class Mahasiswa {
    private String nama;
    private int angkatan;
    private String jurusan;
    
    //Constructor 1
    private Mahasiswa(){}
   
    //Constructor 2
    public Mahasiswa(String nama){
        this.nama = nama;
        angkatan = 2020;
        jurusan = "Sistem Informasi";
    }
    
    //Constructor 3
    public Mahasiswa(int angkatan){
        this.angkatan = angkatan;
    }
    
    //Constructor 4
    public Mahasiswa(String nama, int angkatan){
        this.nama = nama;
        this.angkatan = angkatan;
        jurusan = "Sistem Informasi";
    }

    //Constructor 5
    public Mahasiswa(String nama, int angkatan, String jurusan) {
        this.nama = nama;
        this.angkatan = angkatan;
        this.jurusan = jurusan + " FILKOM UB";
    }
    
    public String getNama() {
        return nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

}
