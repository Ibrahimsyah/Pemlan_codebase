/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author ibrahimsyah
 */
public class Akun {
    private String username;
    private String nama;
    private int umur;
    private char gender;
    
    public Akun(){
        username = "";
        nama = "";
        umur = 0;
        gender = 'L';
    }
    
    public Akun(String nama, int umur){
        this();
        this.nama = nama;
        this.umur = umur;
    }
    
    public Akun(int umur, String username){
        this();
        this.umur = umur;
        this.username = username;
    }

    public Akun(String username, String nama, int umur, char gender) {
        this.username = username;
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
    }
    
    public String cetakData(){
        String data = "";
        data += "Nama: " + nama + "\n";
        data += "Username: " + username + "\n";
        data += "Umur: " + umur + "\n";
        data += "Gender: " + gender + "\n";
        
        return data;
    }
}
