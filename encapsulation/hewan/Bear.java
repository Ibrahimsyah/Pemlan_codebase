
package encapsulation.hewan;

import encapsulation.makananhewan.Whiskas;

public class Bear {
    private String nama;
    private int berat;
    private Whiskas makanan;

    public Bear(String nama, int berat, Whiskas makanan) {
        this.nama = nama;
        this.berat = berat;
        this.makanan = makanan;
    }
    
    public String mintaNama(){
        return nama;
    }
    
    void masukanNama(String nama){
        this.nama = nama;
    }
    
    int getBeratMakanan(){
        return makanan.getBerat();
    }
}
