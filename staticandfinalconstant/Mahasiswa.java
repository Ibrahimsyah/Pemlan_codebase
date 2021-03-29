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
public class Mahasiswa {

    private static final String awalanNim = "29032020";
    private static int akhiranNim = 101;

    private final String nama;
    private final int umur;
    private final String nim;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        nim = awalanNim + akhiranNim;
        akhiranNim += 4;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNim() {
        return nim;
    }

    
    //<Visibility Modifier> <Modifier (static / non static)> <Return type> 
//    <Nama Method>(<Tipe data param1> <Nama variable param1>, ...)
    public static void cetakDataMahasiswa(Mahasiswa mhs) {
        System.out.printf("Nama: %s\n", mhs.getNama());
        System.out.printf("Nim: %s\n", mhs.getNim());
        System.out.printf("Umur: %s\n", mhs.getUmur());
        System.out.println("-------------------");

    }
}
