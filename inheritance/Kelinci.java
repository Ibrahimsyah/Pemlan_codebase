/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ibrahimsyah
 */
public class Kelinci extends Hewan{
    private String warnaBulu;

    public Kelinci(String warnaBulu, int berat, int umur) {
        super(berat, umur);
        this.warnaBulu = warnaBulu;
    }
    
    public void tidur(){
        System.out.println("Kelinci sedang tidur");
    }

    @Override
    public void bergerak() {
        System.out.println("Kelinci sedang lari"); 
    }

    @Override
    public void makan() {
        System.out.println("Kelinci sedang makan");
    }
    
    
}
