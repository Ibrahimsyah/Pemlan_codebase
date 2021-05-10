/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ibrahimsyah
 */
public abstract class MakhlukHidup {
    private int umur;

    public MakhlukHidup(int umur) {
        this.umur = umur;
    }
    
    public abstract void bergerak(); //Harus berada di dalam abstract class
    
    public abstract void makan();
    
    public void tidur(){
        System.out.println("Makhluk Hidup tidak sadar ketika tidur");
    }
    
    public void bernafas(){
        System.out.println("Makhluk Hidup menghirup oksigen untuk bernafas");
    }
    
    public int getUmur() {
        return umur;
    }
}
