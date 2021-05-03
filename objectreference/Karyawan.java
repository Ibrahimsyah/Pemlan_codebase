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
public class Karyawan {

    private final Bank bank;
    private final Pekerjaan pekerjaan;
    private final Rumah rumah;
    private final String nama;
    private final int umur;

    public Karyawan(Bank bank, Pekerjaan pekerjaan, Rumah rumah, String nama, int umur) {
        this.bank = bank;
        this.pekerjaan = pekerjaan;
        this.rumah = rumah;
        this.nama = nama;
        this.umur = umur;
    }

    public void kerja(int lamaKerja) {
        double gaji = this.pekerjaan.getGaji();
        if (lamaKerja > 8) {
            int kelebihanJam = lamaKerja - 8;
            gaji += 100000 * kelebihanJam;
        }
        this.bank.setSaldo(gaji);
    }

    public static void promosi(Karyawan karyawan) {
        double gajiSaatIni = karyawan.pekerjaan.getGaji();
        karyawan.pekerjaan.setGaji(gajiSaatIni * 101.5 / 100);
    }

    public static double hitungPajak(Karyawan karyawan, int bulan) {
        double pajak = 0;
        pajak += karyawan.bank.getSaldo() * 1.2 / 100 *  bulan;
        String tipeRumah = karyawan.rumah.getTipe();
        double persentasePajak;
        switch (tipeRumah) {
            case Rumah.TIPE_BESAR:
                persentasePajak = 0.75;
                break;
            case Rumah.TIPE_SEDANG:
                persentasePajak = 0.5;
                break;
            default:
                persentasePajak = 0.25;
                break;
        }
        pajak += persentasePajak / 100 * karyawan.rumah.getHarga() * bulan;
        return pajak;
    }
    
    public void cetak(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Alamat :" + this.rumah.getAlamatLengkap());
        System.out.println("Pekerjaan :" + this.pekerjaan.getRole());
        System.out.println("Gaji :" + this.pekerjaan.getGaji());
        System.out.println("Saldo:" + this.bank.getSaldo());
        System.out.println("Umur: " + this.umur);
        System.out.println("========================");
    }
}
