
package classdanobject;

public class Human {
    private String nama;
    private int umur;
    private int tinggiBadan;
    private int beratBadan;
    private Book buku;
    
    // alt + insert
    public Human(String nama, int umur, int tinggiBadan, int beratBadan) {
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    public Book getBuku() {
        return buku;
    }

    public void setBuku(Book buku) {
        this.buku = buku;
    }
    
    
}
