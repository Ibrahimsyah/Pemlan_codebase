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
public class Mesin {
    private double berat;
    private double konsumsiPerKm;
    
    public Mesin(double berat, double konsumsiPerKm){
        this.berat = berat;
        this.konsumsiPerKm = konsumsiPerKm;
    }
    
    public double getKonsumsiPerKm(){
        return konsumsiPerKm;
    }
    
    public double getBerat(){
        return berat;
    }
}
