/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp;

import java.util.Scanner;
/**
 *
 * @author ibrahimsyah
 */
class Pesawat {

    private String nama;
    private Manusia[] penumpang;
    private int kapasitasMax;
    private int jumlahPenumpang;
    private long hargaTiket;

    public Pesawat(String nama, int kapasitasMax, long hargaTiket) {
        this.nama = nama;
        this.kapasitasMax = kapasitasMax;
        this.hargaTiket = hargaTiket;
        jumlahPenumpang = 0;
        penumpang = new Manusia[kapasitasMax];
    }

    public void tambahPenumpang(Manusia[] penumpang) {
        for (int i = 0; i < penumpang.length; i++) {
            if(jumlahPenumpang == kapasitasMax){
                break;
            }
            this.penumpang[jumlahPenumpang++] = penumpang[i];
        }
    }

    private long hitungOmzet() {
        return jumlahPenumpang * hargaTiket;
    }

    public void cetakStatus() {
        System.out.printf("Nama pesawat: %s\n", nama);
        System.out.printf("Jumlah Penumpang: %s\n", jumlahPenumpang);
        System.out.printf("Penumpang pertama: %s\n", penumpang[0].getNama());
        System.out.printf("Penumpang terakhir: %s\n", penumpang[jumlahPenumpang-1].getNama());
        System.out.printf("Total Omzet: %d\n", hitungOmzet());
    }
}

class Manusia {

    private String nama;

    public Manusia(String name) {
        this.nama = name;
    }

    public String getNama() {
        return nama;
    }
}

public class Problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String namaPesawat = in.next();
        int penumpangMax = in.nextInt();
        long hargaTiket = in.nextLong();
        Pesawat p1 = new Pesawat(namaPesawat, penumpangMax, hargaTiket);
        int jumlahPenumpang1 = in.nextInt();
        Manusia[] penumpang1 = new Manusia[jumlahPenumpang1];
        for (int i = 0; i < jumlahPenumpang1; i++) {
            String nama = in.next();
            penumpang1[i] = new Manusia(nama);
        }
        p1.tambahPenumpang(penumpang1);
        int jumlahPenumpang2 = in.nextInt();
        Manusia[] penumpang2 = new Manusia[jumlahPenumpang2];
        for (int i = 0; i < jumlahPenumpang2; i++) {
            String nama = in.next();
            penumpang2[i] = new Manusia(nama);
        }
        p1.tambahPenumpang(penumpang2);
        p1.cetakStatus();
    }
}
