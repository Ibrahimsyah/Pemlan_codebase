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
public class Problem2 {
//        Di suatu perusahaan, terdapat Pegawai yang selalu bekerja. Pegawai memiliki
//    atribut NIP, nama, tahunMasuk, dan kelamin. Pekerja memiliki kemampuan untuk
//    bekerja yang mana ketika di panggil akan mencetak "Pekerja sedang bekerja".
//    Pekerja juga memiliki kemampuan untuk istirahat yang akan mencetak "Pekerja
//    sedang istirahat"
//
//    Pegawai dibagi menjadi beberapa role spesifik yaitu:
//    1. Sekretaris: memiliki atribut tambahan yaitu kecepatanKetik. 
//       Kemampuan bekerja pada sekretaris akan mencetak 
//       "Sekretaris mengurus administrasi dengan kecepatan ketik <kecepatanTulis> kpm". 
//       Ketika istirahat, akan mencetak "Sekretaris sedang makan siang", dan ketika 
//       istirahat dipanggil menggunakan 1 parameter bertipe String maka akan mencantumkan 
//       makanan yang sedang di makan. Contoh: "Sekretaris sedang makan siang dengan Cabai"
//
//    2. Teknisi: memiliki atribut tambahan yaitu pengalamanKerja. Kemampuan bekerja pada 
//       role ini akan mencetak "Teknisi <nama> sedang bekerja".

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("1", "Sam", 2010, "Laki laki");
        pegawai.bekerja();
        pegawai.istirahat();
        System.out.println(pegawai);

        Sekretaris sekretaris = new Sekretaris(200, "2", "Annie", 2019, "Perempuan");
        sekretaris.bekerja();
        sekretaris.istirahat();
        sekretaris.istirahat("Bakso mercon");
        System.out.println(sekretaris);

        Teknisi teknisi = new Teknisi(5,"3", "Her", 2001, "Perempuan");
        teknisi.bekerja();
        teknisi.istirahat();
        System.out.println(teknisi);
    }
}
