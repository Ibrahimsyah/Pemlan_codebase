package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Kucing extends Hewan {
    private String kelamin;

    public Kucing(String kelamin, int berat, int umur) {
        super(berat, umur);
        this.kelamin = kelamin;
    }

    public void lompat() {
        System.out.println("Cat sedang melompat");
    }
    
    @Override
    public void makan() {
        System.out.println("Cat sedang makan");
    }

    @Override
    public void bergerak() {
        super.bergerak();
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Kelamin: " + this.kelamin + "\n";
        result += "Berat lagi: " + super.getBerat() + "\n";
        return result;
    }

}
