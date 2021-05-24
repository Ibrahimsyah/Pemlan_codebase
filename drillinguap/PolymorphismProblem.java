package drillinguap;

/**
 *
 * @author Ibrahimsyah
 */
abstract class Kue {

    private final String nama;
    private final double harga;
    private final String jenisKue;

    public Kue(String nama, double harga, String jenisKue) {
        this.nama = nama;
        this.harga = harga;
        this.jenisKue = jenisKue;
    }

    abstract double hitungHarga();

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Nama: " + nama + "\n";
        result += "Jenis Kue: " + jenisKue + "\n";
        return result;
    }
}

class KuePesanan extends Kue {

    private final double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga, "Kue Pesanan");
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    double hitungHarga() {
        return super.getHarga() * berat;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Harga: " + hitungHarga() + "\n";
        return result;
    }

}

class KueJadi extends Kue {

    private final double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga, "Kue Jadi");
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    double hitungHarga() {
        return super.getHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Harga: " + hitungHarga() + "\n";
        return result;
    }
}

public class PolymorphismProblem {

    public static void main(String[] args) {
        int jumlahKue = 6;
        Kue[] kueku = new Kue[jumlahKue];
        kueku[0] = new KueJadi("kuejadi1", 1000, 1);
        kueku[1] = new KuePesanan("kuepesanan1", 2000, 2);
        kueku[2] = new KuePesanan("kuepesanan2", 1000, 1);
        kueku[3] = new KuePesanan("kuepesanan3", 3000, 4);
        kueku[4] = new KueJadi("kuejadi2", 1500, 5);
        kueku[5] = new KuePesanan("kuepesanan4", 5000, 10);

        double totalHargaKue = 0;
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;

        int totalBeratPesanan = 0;
        double totalJumlahPesanan = 0;

        double hargaKueTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : kueku) {
            System.out.println(kue);
            if (kue instanceof KuePesanan) {
                //Kue kue yang merupakan Kue Pesanan
                KuePesanan kuePesanan = (KuePesanan) kue;
                totalHargaPesanan += kuePesanan.hitungHarga();
                totalBeratPesanan += kuePesanan.getBerat();
            } else {
                //Kue kue yang merupakan Kue Jadi
                KueJadi kueJadi = (KueJadi) kue;
                totalHargaJadi += kueJadi.hitungHarga();
                totalJumlahPesanan += kueJadi.getJumlah();
            }
            //Mencari kue dengan harga terbesar
            if (kue.hitungHarga() > hargaKueTerbesar) {
                kueTerbesar = kue;
                hargaKueTerbesar = kue.hitungHarga();
            }
            totalHargaKue += kue.hitungHarga();
        }
        System.out.println("Total Harga Kue: " + totalHargaKue);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Pesanan: " + totalJumlahPesanan);
        System.out.println("Kue dengan Harga Terbesar:" );
        System.out.println(kueTerbesar);
    }
}
