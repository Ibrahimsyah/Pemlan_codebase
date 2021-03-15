package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Problem3 {
//    Sebuah program diciptakan untuk melakukan simulasi pengujian mobil. 
//    Setiap mobil memiliki panjang, berat, dan kecepatan 
//    pengujian dapat dilakukan dengan menggunakan 
//    fungsi yang ada pada mobil tersebut bernama ujiBalap. 
//    ujiBalap memiliki beberapa fungsi tergantung dari input yang 
//    diberikan kepadanya:
//    1. Jika input berupa jarak (int), maka akan mengembalikan nilai 
//    desimal yang bernilai jarak / kecepatan
//    2. Jika input berupa jumlahBBM (double), maka akan mengembalikan 
//    nilai desimal berupa berat / jumlahBBM
//    3. Jika input berupa jarak (int) dan jumlahBBM (double), 
//    maka akan mencetak "Mobil melaju dengan kecepatan <kecepatan> dan dengan efisiensi bahan bakar <efisiensi>"
//    dengan efiensi = jumlahBBM / jarak
//    4. Jika input berupa jumlahBBM (double) dan beratTambahan (int), 
//    maka akan mengembalikan nilai desimal 
//    berupa (berat + beratTambahan)/jumlahBBM
    
    public static void main(String[] args) {
        Mobil m1 = new Mobil(200, 2000, 100);
        System.out.println(m1.ujiBalap(100));
        System.out.println(m1.ujiBalap(20.5));
        m1.ujiBalap(50, 10.2);
        System.out.println(m1.ujiBalap(50.1, 20));
    }
}
