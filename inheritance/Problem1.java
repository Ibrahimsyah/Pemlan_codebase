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
        Manusia manusia = new Manusia("Jack", 20, "Laki");
        System.out.println(manusia);

        Pekerja pekerja = new Pekerja("Jack", 20, "Laki", "12234", 20000);
        pekerja.bekerja();
        System.out.println(pekerja);

        Manajer manajer = new Manajer( "IT", "Jimbo", 24, "Laki", "13", 1255);
        System.out.println(manajer);
    }
}
