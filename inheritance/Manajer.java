/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.time.LocalDate;

/**
 *
 * @author ibrahimsyah
 */
public class Manajer extends Pekerja{
//    − departemen : String
//    + setter, getter
    private String departmen;

    public Manajer(String departmen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah);
        this.departmen = departmen;
    }

    @Override
    public double getTunjangan() {
        double result = super.getTunjangan();
        result += 10.0/100 * super.getGaji();
        return result;
    }

        @Override
    public String toString() {
        String result = super.toString();
        result += "Departemen: " + departmen + "\n";
        return result;
    }
}
