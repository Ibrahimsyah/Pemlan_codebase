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
public class Pekerjaan {

    private String role;
    private double gaji;

    public Pekerjaan(String role, double gaji) {
        this.role = role;
        this.gaji = gaji;
    }

    public String getRole() {
        return role;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    

}
