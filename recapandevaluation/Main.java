/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recapandevaluation;

/**
 *
 * @author ibrahimsyah
 */
public class Main {
    public static void main(String[] args) {
        boolean isCat = true;
        System.out.println(isCat);
        System.out.println(!isCat); // not isCat
        
        //condition = true OR false
        String kucing1 = "Smitty";
        String namaKucingHilang = "smitty";
        
        boolean condition = !kucing1.equalsIgnoreCase(namaKucingHilang);
        System.out.println(condition);
        if(condition){
            System.out.println("Sama");
        }else{
            System.out.println("Tidak Sama");
        }
        //zoom in - out di netbeans = alt + scroll
    }
   
}
