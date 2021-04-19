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
public class Mobil {

    static final String TIPE_SEDAN = "Sedan";
    static final String TIPE_SPORT = "Sport";
    static final String TIPE_SUV = "SUV";

    private Mesin mesin;
    private Roda[] roda;
    private BahanBakar bahanBakar;
    private String tipeMobil;
    private double berat;
    private double kapasitasTangki;

    public Mobil(
            Mesin mesin,
            Roda[] roda,
            BahanBakar bahanBakar,
            String tipeMobil,
            double berat,
            double kapasitasTangki) {
        this.mesin = mesin;
        this.roda = roda;
        this.bahanBakar = bahanBakar;
        this.tipeMobil = tipeMobil;
        this.berat = berat;
        this.kapasitasTangki = kapasitasTangki;
    }

    // Parameter 1: Object dari class Roda
    // Parameter 2: index dari roda yang akan diganti (0-3)
    public void gantiRoda(Roda roda, int n) {
        if (n >= 0 && n <= 3) {
            this.roda[n] = roda;
        } else {
            System.out.println("Hey, indexnya salah nih. Cek lagi ya!");
        }
    }

    // Parameter1: Object dari class BahanBakar
    // Parameter2: jumlahLiter yang diisi (int)
    // Return: banyaknya liter * harga bahan bakar (int)
    // Rule: Hanya dapat menerima bahan bakar dengan oktan yang sama
    public int isiBahanBakar(BahanBakar bahanBakar, int jumlahLiter) {
        int harga = 0;
        if (bahanBakar.getOktan() == this.bahanBakar.getOktan()) {
            // Jika oktan sama
            this.bahanBakar = bahanBakar;
            harga = bahanBakar.getHargaPerLiter() * jumlahLiter;
        } else {
            // Jika oktan tidak sama
            System.out.println("Hey, oktannya tidak sama nih. Cek lagi ya!");
        }
        return harga;
    }

    // Parameter 1: jarak tempuh mobil (double)
    // Return: banyaknya bahan bakar yang terpakai (jarak * konsumsiPerKm) (double)
    public double jalan(double jarak) {
        return jarak * this.mesin.getKonsumsiPerKm();
    }
    
    // Parameter 1: Mobil yang akan diganti mesin
    // Parameter 2: Mesin yang menjadi pengganti
    public static void tuneUp(Mobil mobil, Mesin mesin){
        mobil.mesin = mesin;
    }
    
    // Parameter 1: Mobil yang akan dihitung beratnya
    // Return: berat total dari mobil tersebut (double)
    public static double ukurBerat(Mobil mobil){
        double beratTotal = 0;
        beratTotal += mobil.berat;
        for(Roda ban : mobil.roda){
            beratTotal += ban.getBerat();
        }
        beratTotal += mobil.mesin.getBerat();
        return beratTotal;
    }
    
    public void cetakInfo(){
        System.out.println("Tipe: " + this.tipeMobil);
        System.out.println("Berat: " + this.berat);
        System.out.println("Berat Mesin: " + this.mesin.getBerat());
        System.out.println("Konsumsi Mesin: " + this.mesin.getKonsumsiPerKm());
        System.out.println("Berat ban: " + this.roda[0].getBerat());
        System.out.println("======================");
    }
}
