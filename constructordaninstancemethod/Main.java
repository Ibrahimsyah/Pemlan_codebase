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
public class Main {

    public static void main(String[] args) {

        //Topic: Constructor
        Mahasiswa mahasiswa = new Mahasiswa("Budi");
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getAngkatan());
        System.out.println(mahasiswa.getJurusan());
        System.out.println("-------------------------------");

        Mahasiswa mahasiswa2 = new Mahasiswa(2020);
        System.out.println(mahasiswa2.getNama());
        System.out.println(mahasiswa2.getAngkatan());
        System.out.println(mahasiswa2.getJurusan());
        System.out.println("-------------------------------");

        Mahasiswa mahasiswa3 = new Mahasiswa("Ani", 2019);
        System.out.println(mahasiswa3.getNama());
        System.out.println(mahasiswa3.getAngkatan());
        System.out.println(mahasiswa3.getJurusan());
        System.out.println("-------------------------------");

        Mahasiswa mahasiswa4 = new Mahasiswa("Akbar", 2018, "Teknologi Informasi");
        System.out.println(mahasiswa4.getNama());
        System.out.println(mahasiswa4.getAngkatan());
        System.out.println(mahasiswa4.getJurusan());
        System.out.println("-------------------------------");

        //Topic: Instance Method
        Kucing kitty = new Kucing("Marco", "Polkadot", "Mongoloid", 30, 4); //Instansiasi kucing baru
        kitty.makan(); //Output: Marco Sedang makan
        kitty.makan("Nasi goreng"); //Output: Marco Sedang makan nasi goreng
        kitty.tidur(); //Output: Marco Sedang tidur
        System.out.println("-------------------------------");

        Kucing kitten = new Kucing("Martin", "Hitam pekat", "Anggora", 30, 4); //Instansiasi kucing baru
        kitten.makan(); //Output: Martin Sedang makan
        kitten.makan("Nasi goreng"); //Output: Martin Sedang makan nasi goreng
        kitten.tidur(); //Output: Martin Sedang tidur
        int jarakTempuhSetelahLari = kitten.jarakLari();
        System.out.println(kitten.getNama()
                + " telah berlari sejauh "
                + jarakTempuhSetelahLari
                + " Kilometer"); //Output: Martin telah berlari sejauh ... Kilometer
        System.out.println("-------------------------------");
    }
}
