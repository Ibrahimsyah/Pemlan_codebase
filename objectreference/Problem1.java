package objectreference;

/**
 *
 * @author ibrahimsyah
 */
public class Problem1 {
//    Terdapat sebuah sistem yang memiliki kemampuan untuk menyimpan mobil.
//    Mobil memiliki atribut berupa mesin, roda yang berjumlah 4, bahan bakar, tipe
//    (Sedan, sport, SUV), berat, dan kapasitas tangki.
//    Mesin memiliki atribut berupa berat dan konsumsiPerKm
//    Roda memiliki atribut diameter dan berat
//    Bahan bakar memiliki atribut oktan dan hargaPerLiter
//    Mobil dapat mengganti rodanya dengan menggunakan fungsi gantiRoda
//    yang menerima parameter sebuah objek roda dan n yang merupakan index roda keberapa
//    yang akan diganti. Kemudian mobil memiliki fungsi untuk isiBahanBakar yang menerima 
//    parameter objek Bahan Bakar dan jumlah liter dengan mengembalikan 
//    nilai berupa berapa banyak 
//    biaya yang di keluarkan. Mobil hanya dapat menerima bahan bakar
//    yang memiliki oktan yang sama. Mobil tentunya memiliki kemampuan untuk jalan 
//    dengan jarak tertentu dan akan menghasilkan nilai berapa banyak bahan bakar yang habis.
//    terdapat fungsi pada class Mobil bernama tuneUp yang digunakan untuk mengganti 
//    mesin mobil dan fungsi ukurBerat yang menerima parameter objek mobil dan 
//    mengembalikan nilai berupa berat total mobil tersebut

    public static void main(String[] args) {
        Mesin v8 = new Mesin(50.5, 8.5);
        Roda roda1 = new Roda(10, 15);
        Roda roda2 = new Roda(10, 15);
        Roda roda3 = new Roda(10, 15);
        Roda roda4 = new Roda(10, 15);
        Roda[] rodaMobil = {roda1, roda2, roda3, roda4};
        BahanBakar methane = new BahanBakar(90, 20000);
        Mobil tayo = new Mobil(v8, rodaMobil, methane, Mobil.TIPE_SEDAN, 2000, 10);
        tayo.cetakInfo();

        Roda pengganti = new Roda(10, 20);
        tayo.gantiRoda(pengganti, 0);
        System.out.println("Setelah ganti roda:");
        tayo.cetakInfo();

        BahanBakar oktanSama = new BahanBakar(90, 10000);
        int biayaYangDiperlukan = tayo.isiBahanBakar(oktanSama, 100);
        System.out.println("Biaya isi BBM: " + biayaYangDiperlukan);

        BahanBakar oktanTakSama = new BahanBakar(89, 10000);
        int biayaYangDiperlukan2 = tayo.isiBahanBakar(oktanTakSama, 100);
        System.out.println("Biaya isi BBM: " + biayaYangDiperlukan2);
        
        double bahanBakar = tayo.jalan(100);
        System.out.println("Bahan bakar dipakai: " + bahanBakar);
        
        Mesin v12 = new Mesin(100, 5);
        Mobil.tuneUp(tayo, v12);
        double bahanBakar2 = tayo.jalan(100);
        System.out.println("Bahan bakar dipakai: " + bahanBakar2);
        
        double beratTotal = Mobil.ukurBerat(tayo);
        System.out.println("Berat total mobil: " + beratTotal);
    }
}
