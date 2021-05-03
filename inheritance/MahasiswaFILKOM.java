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
public class MahasiswaFILKOM extends Manusia {
//    − nim : String
//− ipk : double
//+ setter, getter
//+ getStatus() : String
//+ getBeasiswa() : double
//+ toString() : String

    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String result = "";
        int angkatan = 2000 + Integer.parseInt(nim.substring(0, 2));
        String prodi = "";
        switch (nim.charAt(6)) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        result += prodi + ", " + angkatan;
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "NIM: " + nim + "\n";
        result += "IPK: " + ipk + "\n";
        result += "Status: " + getStatus() + "\n";
        return result;
    }

}
