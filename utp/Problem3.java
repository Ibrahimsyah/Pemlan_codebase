package utp;

import java.util.Scanner;

/**
 * @author ibrahimsyah
 */

class Kalkulator {
    private int jumlahPakai = 0;

    public int hitung(int angka) {
        jumlahPakai++;
        return angka * angka * angka;
    }

    public double hitung(double angka) {
        jumlahPakai++;
        return angka * 8.4;
    }

    public double hitung(double angka1, double angka2, char operator) {
        jumlahPakai++;
        switch (operator) {
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                return angka1 / angka2;
            default:
                return 0;
        }
    }

    public int getJumlahPakai() {
        return jumlahPakai;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        String selectedMenu = "";
        while (!selectedMenu.equals("SELESAI")) {
            selectedMenu = in.next();
            switch (selectedMenu) {
                case "CARA_1": {
                    int input = in.nextInt();
                    int hasil = kalkulator.hitung(input);
                    System.out.printf("Cara 1: %d\n", hasil);
                    break;
                }
                case "CARA_2": {
                    double input = in.nextDouble();
                    double hasil = kalkulator.hitung(input);
                    System.out.printf("Cara 2: %f\n", hasil);
                    break;
                }
                case "CARA_3": {
                    double input1 = in.nextDouble();
                    double input2 = in.nextDouble();
                    char operator = in.next().charAt(0);
                    double hasil = kalkulator.hitung(input1, input2, operator);
                    System.out.printf("Cara 3: %f\n", hasil);
                    break;
                }
            }
        }
        System.out.printf("Kalkulator telah melakukan komputasi" +
                " sebanyak %d kali\n", kalkulator.getJumlahPakai());
    }
}
