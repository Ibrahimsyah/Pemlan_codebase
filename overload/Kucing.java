package overload;

public class Kucing {

    private String nama;
    private double berat;
    private String ras;
    private double tinggi;

    //Constructor1
    Kucing() {
        nama = "marco";
        berat = 4.0;
        ras = "Persia";
        tinggi = 14.0;
    }

    //Constructor 2
    //Parameter1: nama (string), Paramater2: berat (double)
    public Kucing(String nama, double berat) {
        this();
        this.nama = nama;
        this.berat = berat;
    }

    //Constructor 3
    //Parameter1: tinggi (double), parameter2: ras (string)
    public Kucing(double tinggi, String ras) {
        this();
        this.tinggi = tinggi;
        this.ras = ras;
    }

    public void cetakData(){
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Berat: " + berat);
        System.out.println("Tinggi: " + tinggi);
    }
    
    //Method1
    public void makan(){
        System.out.println(nama + " sedang makan");
    }
    
    //Method2
    public void makan(String namaMakanan){
        System.out.println(nama + " sedang makan " + namaMakanan);
    }
    
    //Method3
    public void makan(double beratMakanan){
        System.out.println(nama + " sudah makan seberat " + beratMakanan);
    }
    
    //Method4
    public double makan(int jumlahMakan){
        //beratBadan = 0.2 * jumlahMakan
        return 0.2 * jumlahMakan; 
    }
}
