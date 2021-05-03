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
public class Teknisi extends Pegawai {

    private int pengalamanKerja;

    public Teknisi(int pengalamanKerja, String NIP, String nama, int tahunMasuk, String kelamin) {
        super(NIP, nama, tahunMasuk, kelamin);
        this.pengalamanKerja = pengalamanKerja;
    }

    @Override
    public void bekerja() {
        System.out.println("Teknisi " + super.getNama() + " sedang bekerja");
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Pengalaman Kerja: " + pengalamanKerja + "\n";
        return result;
    }
}
