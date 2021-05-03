package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Manusia {
//    − nama : String
//− jenisKelamin : boolean (true : laki-laki, false : perempuan)
//− nik : String
//− menikah : boolean
//+ setter, getter
//+ getTunjangan() : double
//+ getPendapatan() : double
//+ toString() : String

    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        //Tunjangan untuk yang telah menikah adalah apabila laki-laki akan mendapat $25
        //sedangkan perempuan mendapat $20.
        double tunjangan = 0;
        if (menikah) {
            if (jenisKelamin) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Nama: " + nama + "\n";
        result += "Kelamin: " + (jenisKelamin ? "Laki laki" : "Perempuan") + "\n";
        result += "NIK: " + nik + "\n";
        result += "Tunjangan: " + getTunjangan() + "\n";
        return result;
    }
}
