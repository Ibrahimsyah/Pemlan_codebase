package overload;

/**
 *
 * @author ibrahimsyah
 */
public class BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public BangunRuang(){
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    
    public BangunRuang(double input1){
        panjang = input1;
        lebar = input1;
        tinggi = input1;
    }
    
    public BangunRuang(double bil1, double bil2){
        panjang = bil1;
        lebar = bil1;
        tinggi = bil2;
    }
    
    public BangunRuang(double[] array){
        panjang = array[0];
        lebar = array[1];
        tinggi = array[2];
    }
    
    public double getVolume(){
        return panjang * lebar * tinggi;
    }
}
