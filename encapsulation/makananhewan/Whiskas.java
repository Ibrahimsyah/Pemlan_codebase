
package encapsulation.makananhewan;

public class Whiskas {
    private int berat;
    private double protein;
    private double lemak;

    public Whiskas(int berat, double protein, double lemak) {
        this.berat = berat;
        this.protein = protein;
        this.lemak = lemak;
    }

    public int getBerat() {
        return berat;
    }

    protected double getProtein() {
        return protein;
    }

    double getLemak() {
        return lemak;
    }
    
}
