package objectreference;

/**
 *
 * @author ibrahimsyah
 */
public class Problem2 {
//    Suatu program dapat mengelola karyawan menerapkan konsep OOP. 
//    Karyawan memiliki bank, pekerjaan, rumah, nama, dan umur. 
//    Bank memiliki nama, dan saldo. Pekerjaan memiliki role dan gaji
//    - karyawan memiliki fungsi kerja dengan menerima parameter 
//      seberapa lama dia bekerja, jika dia bekerja <= 8 jam, maka dia 
//      akan mendapat gaji standard. Jika dia bekerja melebihi 8 jam maka 
//      kelebihan jam akan dibayar 100000*kelebihan jam. Gaji akan langsung masuk 
//      kedalam saldo bank milik karyawan tersebut
//    - Bank hanya memiliki kemampuan untuk setSaldo dimana fungsi ini dipanggil 
//      ketika karyawan memasukkan gaji kedalam bank. Fungsi ini otomatis akan 
//      memotong nominal uang sebesar 0.5% saat karyawan memasukkan uang.
//    - Rumah memiliki atribut alamat lengkap, harga, dan tipe rumah 
//      (kecil, sedang, besar)
//    - class Karyawan memiliki kemampuan promosi, yaitu menaikkan gaji 
//      karyawan yang di inputkan kedalam parameternya menjadi 1.5% dari gaji awalnya.
//    - class Karyawan juga dapat menghitung pajak yang harus dikeluarkan 
//      karyawan. Fungsi ini menerima karyawan dan lama bulan sebagai 
//      parameternya dan mengembalikan nilai berupa pajak yang harus 
//      dikeluarkan karyawan tersebut dalam kurun waktu yang disebutkan. 
//      Penentuan pajak dilakukan dengan aturan:
//        1. Uang di bank akan terkena pajak 1.2% perbulan
//        2. Rumah akan terkena pajak dengan urutan: Tipe Kecil 0.25%, 
//           Tipe sedang 0.5%, Tipe besar 0.75%, pajak rumah diambil dari 
//           harga rumah * persentase pajak.

    public static void main(String[] args) {
        Bank bank = new Bank("BCA", 0);
        Pekerjaan pekerjaan = new Pekerjaan("Kuli", 100000);
        Rumah rumah = new Rumah("Malang", 200000, Rumah.TIPE_BESAR);
        Karyawan karyawan1 = new Karyawan(bank, pekerjaan, rumah, "Sam", 30);
        karyawan1.cetak();
        System.out.println("=======");
        System.out.println("Setelah bekerja 10 jam: ");
        karyawan1.kerja(10);
        karyawan1.cetak();
    }
}
