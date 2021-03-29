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
public class Problem2 {
    
//    Suatu kampus bernama BU berniat untuk membuat program pendata mahasiswa baru.
//    mahasiswa yang akan di daftarkan akan memiliki nim, nama, dan umur.
//    pada saat pembuatannya, hanya nama dan umur saja yang diberikan karena nim akan
//    di buatkan otomatis oleh sistem dan nim setiap siswa berbeda satu sama lain.
//    penentuan nim dilakukan dengan aturan:
//	a. nim pertama bernilai 29032020101
//	b. nim kedua bernilai 29032020105
//	c. nim ketiga bernilai 29032020109
//      d. dan seterusnyaaaaa
//    Kampus tersebut dapat melakukan cetakDataMahasiswa dengan menginputkan mahasiswa, 
//    dan akan mengeluarkan output berupa data diri mahasiswa tersebut.

    public static void main(String[] args) {
        Mahasiswa jimmy = new Mahasiswa("Jimmy", 15);
        Mahasiswa budi = new Mahasiswa("Budi", 23);
        Mahasiswa.cetakDataMahasiswa(jimmy);
        Mahasiswa.cetakDataMahasiswa(budi);
    }
}
