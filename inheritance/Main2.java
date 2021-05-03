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
public class Main2 {

    public static void main(String[] args) {
        Manusia m1 = new Manusia("m1", true, "1", true);
        System.out.println(m1);

        Manusia m2 = new Manusia("m2", false, "2", true);
        System.out.println(m2);

        Manusia m3 = new Manusia("m3", true, "3", false);
        System.out.println(m3);

        //String nim, double ipk, String nama, boolean jenisKelamin, String nik, boolean menikah)
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("185150400111001", 2.99, "mhs1", true, "11", false);
        System.out.println(mhs1);

        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("195150200111001", 3.49, "mhs2", true, "11", false);
        System.out.println(mhs2);

        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("205150600111001", 3.99, "mhs3", true, "11", false);
        System.out.println(mhs3);

//       gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik,  menikah
        LocalDate p1Date = LocalDate.of(2019, 1, 1);
        Pekerja p1 = new Pekerja(1000, p1Date, 2, "p1", true, "111", true);
        System.out.println(p1);

        LocalDate p2Date = LocalDate.of(2012, 1, 1);
        Pekerja p2 = new Pekerja(1000, p2Date, 0, "p2", true, "222", false);
        System.out.println(p2);

        LocalDate p3Date = LocalDate.of(2001, 1, 1);
        Pekerja p3 = new Pekerja(1000, p3Date, 10, "p1", true, "111", true);
        System.out.println(p3);

        // departmen, gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah
        LocalDate mgr1Date = LocalDate.of(2006, 1, 1);
        Manajer mgr1 = new Manajer("IT", 7500, mgr1Date, 0, "mgr1", true, "1111", true);
        System.out.println(mgr1);
    }
}
