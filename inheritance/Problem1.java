package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Problem1 {
//     Terdapat suatu class bernama Manusia, class ini memiliki atribut
//             - nama
//             - kelamin
//             - umur
//     class ini memiliki kemampuan sebagai berikut
//             - makan() -> cetak "<nama> sedang makan"
//             - minum() -> cetak "<nama> sedang minum"
//             
//     Lalu terdapat class bernama Pekerja yang merupakan turunan dari class 
//     Manusia, bedanya adalah class ini memiliki atribut tambahan yaitu nip dan
//     gaji. Pekerja juga memiliki kemampuan khusus yaitu bekerja. Kemampuan
//     yang di wariskan dari parent memiliki beberapa perubahan yaitu
//             - makan() -> cetak "Pekerja <nama> sedang makan"
//             - minum() -> cetak "Pekerja <nama> sedang minum"
//     Ternyata, Pekerja memiliki subclass yang bernama Manajer, Manajer memiliki
//     atribut tambahan yaitu departement. Dan memiliki kemampuan tambahan yaitu
//             - rapat() -> cetak "Manajer sedang rapat"

    public static void main(String[] args) {
        // Some magics
        
        Manusia manusia = new Manusia("Jimmy", "Laki laki", 19);
        manusia.makan();
        manusia.minum();
        
        Pekerja pekerja = new Pekerja("112233", 10000, "Jimbo", "Perempuan", 19);
        pekerja.makan();
        pekerja.minum();
        pekerja.bekerja();
        
        Manajer manajer = new Manajer("IT", "111133", 199999, "Smitty", "Laki laki", 19);
        manajer.makan();
        manajer.minum();
        manajer.bekerja();
        manajer.rapat();
        
        manajer.manusiaMakan();
    }
}
