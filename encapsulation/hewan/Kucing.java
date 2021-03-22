package encapsulation.hewan;

public class Kucing {
    private String nama; //camelCase
    private int berat;

    public Kucing(String nama, int berat) {
        this.nama = nama;
        this.berat = berat;
    }
    
    public int jarakLari(){
        //jarak = 2 * berat kucing
        return 2 * berat;
    }

    public String getNama() {
        return nama;
    }
}
