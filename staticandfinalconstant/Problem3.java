/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinalconstant;

/**
 *
 * @author Ibrahimsyah
 */
public class Problem3 {
//    Sebuah toko baju menjual baju berbagai merk branded. Toko tersebut menyediakan 
//    merk:
//	- Denim
//	- Levis
//	- Jubah
//	- Koko
//    Setiap baju memiliki harga dan merk baju. Lalu toko tersebut dapat melakukan 
//    suatu aktivitas buatBanyakBaju yang menghasilkan kumpulan baju dengan merk 
//    sama namun dengan harga yang berselisih 10000. buatBanyakBaju dapat dipanggil 
//    tanpa harus membuat objek baju terlebih dahulu dan menerima inputan berupa
//    hargaAwal, jumlahBaju, dan merkBaju
    
    public static void main(String[] args) {
        Baju[] hasil = Baju.buatBanyakBaju(20000, 5, Baju.MERK_LEVIS);
        for(Baju baju: hasil){
            System.out.println(baju.getMerk());
            System.out.println(baju.getHarga());
        }
    }
}
