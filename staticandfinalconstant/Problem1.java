/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinalconstant;

/**
 *
 * @author Ibrahimsyah
 */
public class Problem1 {
//    Terdapat sebuah rumah adopsi kucing. Tempat ini akan menerima kucing liar apapun
//    yang sebatangkara agar dapat di adopsi oleh orang yang menginginkannya. Rumah 
//    tersebut memiliki sistem pemberian identitas kepada kucing yang masuk kesana
//    berupa angka yang akan dicetak pada kalung kucing tersebut. Saat masuk ke rumah itu,
//    kucing liar akan diidentifikasi terlebih dahulu rasnya, baru diberi nomor identitas.
//    Nomor identitas memiliki aturan:
//        - Kucing pertama akan mendapat angka 1000
//        - Kucing selanjutnya akan mendapat angka 1005, 1010, 1015, dan seterusnya
//        - Nomer identitas di generate oleh sistem, sehingga pemilik rumah adopsi tidak
//        perlu memberikan secara manual
//    Buatlah program untuk membantu rumah adopsi itu menentukan nomor identitas kucing

    public static void main(String[] args) {
        Kucing kitty = new Kucing(Kucing.RAS_PERSIA);
        Kucing doggo = new Kucing(Kucing.RAS_CIHUAHUA);
        Kucing.cetakInfoKucing(kitty);
        Kucing.cetakInfoKucing(doggo);
        System.out.println(Kucing.nomorIdentitasKucing);
    }
}
