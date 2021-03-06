package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Problem2 {
//    Coco ingin membuat sebuah program pembuatan akun sederhana. 
//    Program tersebut dapat membuat banyak akun yang seragam, 
//    namun data input untuk tiap akun bisa saja berubah ubah. Akun tersebut 
//    memiliki username, nama, umur, dan gender (L atau P). Karena data 
//    input tiap akun bisa saja berubah ubah ketika proses pembuatan, 
//    terdapat beberapa aturan:
//    1. Jika tidak ada input, maka username = "", nama = "", umur = 0, gender = 'L'
//    2. Jika tersedia input nama dan umur, maka nama = nama, umur = umur, 
//       sisanya mengikuti aturan 1
//    3. Jika tersedia umur, dan username, maka username = username, 
//       umur = umur, sisanya mengikuti aturan 1
//    4. Jika seluruh input sesuai dengan atribut, maka sesuaikan 
//       sesuai input = atribut
//    Lalu terdapat juga sebuah method cetakData() yang mengembalikan string dan berisi seluruh atribut yang ada
    
    public static void main(String[] args) {
        Akun a1 = new Akun();
        Akun a2 = new Akun("Martin", 20);
        Akun a3 = new Akun(18, "budi009");
        Akun a4 = new Akun("arif01", "Arif", 20, 'P');
        
        System.out.println(a1.cetakData());
        System.out.println(a2.cetakData());
        System.out.println(a3.cetakData());
        System.out.println(a4.cetakData());
    }

}
