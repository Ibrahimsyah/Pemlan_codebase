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
public class Sekretaris extends Pegawai {

    private int kecepatanKetik;

    public Sekretaris(int kecepatanKetik, String NIP, String nama, int tahunMasuk, String kelamin) {
        super(NIP, nama, tahunMasuk, kelamin);
        this.kecepatanKetik = kecepatanKetik;
    }

    @Override
    public void bekerja() {
        System.out.println("Sekretaris mengurus administrasi dengan kecepatan ketik " + kecepatanKetik + " kpm");
    }

    @Override
    public void istirahat() {
        System.out.println("Sekretaris sedang makan siang");
    }

    public void istirahat(String makanan) {
        System.out.println("Sekretaris sedang makan siang dengan " + makanan);
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Kecepatan Ketik: " + kecepatanKetik + "\n";
        return result;
    }
}
