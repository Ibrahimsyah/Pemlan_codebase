/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreference;

/**
 *
 * @author ibrahimsyah
 */
public class BahanBakar {
    private int oktan;
    private int hargaPerLiter;
    
    public BahanBakar(int oktan, int hargaPerLiter){
        this.oktan = oktan;
        this.hargaPerLiter = hargaPerLiter;
    }
    
    public int getOktan(){
        return oktan;
    }
    
    public int getHargaPerLiter(){
        return hargaPerLiter;
    }
}
