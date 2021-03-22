
package encapsulation;
import encapsulation.hewan.*;
//import encapsulation.hewan.Bear;
//import encapsulation.hewan.Kucing;
import encapsulation.makananhewan.Whiskas;

public class Generator {
    
    //method1: generate 1 kucing, return 1 kucing;
    public Kucing buatKucing(String nama, int berat){
        Kucing hasil = new Kucing(nama, berat);
        return hasil;
    }
    
    //method2: generate 1 beruang, return 1 beruang;
    public Bear buatBeruang(String nama, int berat, Whiskas makanan){
        return new Bear(nama, berat, makanan);
    }
    
    //method3: print Nama kucing, parameternya bertipe Kucing
    public void printKucing(Kucing kitty){
        System.out.println(kitty.getNama());
    }
}
