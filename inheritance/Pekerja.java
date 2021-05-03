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
public class Pekerja extends Manusia {
//    − gaji : double
//− tahunMasuk : LocalDate
//− jumlahAnak : int
//+ setter, getter
//+ getBonus() : double
//+ getGaji() : double
//+ toString() : String

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }
    
    public double getBonus() {
        double result = 0;
        //o Jika lama bekerja 0 – 5 tahun, maka bonus sebesar 5% dari gaji
        //o Jika lama bekerja 5 – 10 tahun, maka bonus sebesar 10% dari gaji
        //o Jika lebih dari 10 tahun, maka bonus sebesar 15% dari gaji
        int tahunSekarang = LocalDate.now().getYear();
        int lamaBekerja = tahunSekarang - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja < 5) {
            result = 5.0 / 100 * gaji;
        } else if (lamaBekerja >= 5 && lamaBekerja <= 10) {
            result = 10.0 / 100 * gaji;
        } else if (lamaBekerja > 10) {
            result = 15.0 / 100 * gaji;
        }
        return result;
    }

    @Override
    public double getTunjangan() {
        double result = super.getTunjangan();
        if (jumlahAnak > 0) {
            result += jumlahAnak * 20;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Tahun Masuk: " + tahunMasuk.getYear() + "\n";
        result += "Jumlah Anak: " + jumlahAnak + "\n";
        result += "Gaji: " + gaji + getTunjangan() + "\n";
        return result;
    }
}
