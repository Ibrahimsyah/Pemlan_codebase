package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Mesin {

    private int bil1;
    private double bil2;

    public Mesin() {
        bil1 = 10;
        bil2 = 9.5;
        System.out.println("Mesin dibuat dengan constructor 1");
    }

    public Mesin(int bil1) {
        this.bil1 = bil1;
        bil2 = 5.5;
        System.out.println("Mesin dibuat dengan constructor 2");
    }

    public Mesin(double bil2) {
        this.bil2 = bil2;
        bil1 = 10;
        System.out.println("Mesin dibuat dengan constructor 3");
    }

    public Mesin(int bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
        System.out.println("Mesin dibuat dengan constructor 4");
    }

    public Mesin(int input1, int input2, double input3) {
        bil1 = input1 + input2;
        bil2 = input3;
        System.out.println("Mesin dibuat dengan constructor 5");
    }
    
    public double hitung(){
        return bil1 * bil2;
    }
    
    public int hitung(int input1){
        return bil1 + input1;
    }
    
    public int hitung(int[] array){
        int hasil = bil1;
        for(int elemen : array){
            hasil += elemen;
        }
        return hasil;
    }
}
