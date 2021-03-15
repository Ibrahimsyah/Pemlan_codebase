package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Problem1 {
//    Terdapat suatu program yang dapat menghitung sebuah bangun ruang. program tersebut 
//    dapat menerima input dan menghasilkan suatu hasil berupa penghitungan volume bangun ruang tersebut. 
//    Bangun ruang tersebut memiliki atribut panjang, lebar, dan tinggi (semuanya dapat menampung bilangan 
//    desimal lebih dari nol. Program itu sangat fleksibel karena pengguna dapat memberikan input 
//    sesuai keinginan mereka ketika bangun ruang tersebut dibuat
//    1. Jika input tidak diberikan sama sekali, maka keseluruhan atribut akan bernilai 0
//    2. Jika input berjumlah 1, maka input tersebut akan menjadi panjang, lebar, dan tinggi
//    3. Jika input berjumlah 2 (katakanlah bil1 dan bil2), maka bil1 akan menjadi panjang dan lebar, 
//       dan bil3 menjadi tinggi
//    3. Jika input merupakan array angka desimal dengan panjang 3, maka array[0] menjadi panjang, 
//       array[1] menjadi lebar, dan array[2] menjadi tinggi
//    Program tersebut diciptakan untuk dapat menghitung volume

    public static void main(String[] args) {
        BangunRuang b1 = new BangunRuang();
        BangunRuang b2 = new BangunRuang(2);
        BangunRuang b3 = new BangunRuang(2, 3);
        double[] array = {1, 4, 5};
        BangunRuang b4 = new BangunRuang(array);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        System.out.println(b3.getVolume());
        System.out.println(b4.getVolume());
    }
}
