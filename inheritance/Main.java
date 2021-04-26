package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan(10, 4);
        System.out.println(hewan);

        Kucing kucing = new Kucing("Jantan", 20, 2);
        System.out.println(kucing);

        Kelinci kelinci = new Kelinci("Betina", 2, 1);
        hewan.bergerak();
        hewan.makan();
        kucing.bergerak();
        kucing.lompat();
        kucing.makan();
        kelinci.bergerak();
        kelinci.tidur();
        kelinci.makan();
    }
}
