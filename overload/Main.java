package overload;

import java.util.Scanner;
/**
 *
 * @author ibrahimsyah
 */
public class Main {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        Kucing kucing2 = new Kucing("Martin", 5.0);
        Kucing kucing3 = new Kucing(20.5, "Anggora");
        
        kucing1.cetakData();
        kucing2.cetakData();
        kucing3.cetakData();
        
        kucing1.makan();
        kucing2.makan("Burger");
        kucing3.makan(50.0);
        double berat = kucing1.makan(3); //Punya return value, maka kita harus masukkan kedalam variable
    
        System.out.println(berat);
        
        Scanner in = new Scanner(System.in);
//        System.out.print("Masukkan nama kucing kamu: ");
//        String nama = in.nextLine();
//        System.out.print("Berapa berat kucing kamu: ");
//        double beratKucing = in.nextDouble();
//        
//        Kucing kucing5 = new Kucing(nama, beratKucing);
//        kucing5.cetakData();
            
    }
}
