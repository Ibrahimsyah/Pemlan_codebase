package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Mobil {

    private int panjang;
    private int berat;
    private int kecepatan;

    public Mobil(int panjang, int berat, int kecepatan) {
        this.panjang = panjang;
        this.berat = berat;
        this.kecepatan = kecepatan;
    }

    public double ujiBalap(int jarak) {
        return jarak / kecepatan;
    }

    public double ujiBalap(double jumlahBBM) {
        return berat / jumlahBBM;
    }

    public void ujiBalap(int jarak, double jumlahBBM) {
        double efisiensi = jumlahBBM / jarak;
        System.out.println("Mobil melaju dengan kecepatan "
                + kecepatan
                + " dan dengan efisiensi bahan bakar "
                + efisiensi);
    }
    
    public double ujiBalap(double jumlahBBM, int beratTambahan){
        return (berat + beratTambahan)/jumlahBBM;
    }
}
