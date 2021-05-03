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
public class Bank {

    private String nama;
    private double saldo;

    public Bank(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo * 99.5 / 100;
    }

}
