package utp;

import java.util.Scanner;

/**
 *
 * @author ibrahimsyah
 */
class Book {

    public static int ISBN_AKHIRAN = 1;
    public static final String ISBN_AWALAN = "ISBN-2020-04-08-";

    private final String judul;
    private final String kategori;
    private final String ISBN;

    public Book(String judul, String kategori) {
        this.judul = judul;
        this.kategori = kategori;
        ISBN = ISBN_AWALAN + ISBN_AKHIRAN++;
    }

    public Book(String judul, String kategori, String ISBN) {
        this.judul = judul;
        this.kategori = kategori;
        this.ISBN = ISBN;
    }

    public static int hitungBukuPerKategori(Book[] kumpulanBuku, String kategori) {
        int hasil = 0;
        for (Book buku : kumpulanBuku) {
            if (buku.kategori.equals(kategori)) {
                hasil++;
            }
        }
        return hasil;
    }

    public static void cetakBukuTerakhir(Book[] kumpulanBuku) {
        Book terakhir = kumpulanBuku[kumpulanBuku.length - 1];
        System.out.printf("Judul buku: %s\n", terakhir.judul);
        System.out.printf("Kategori buku: %s\n", terakhir.kategori);
        System.out.printf("ISBN buku: %s\n", terakhir.ISBN);
    }
}

//Class ini tidak perlu di ubah ubah
public class Problem2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBuku = in.nextInt();
        in.nextLine();
        Book[] shelf = new Book[jumlahBuku];
        int bookCounter = 0;
        String selectedMenu = "";
        while (!selectedMenu.equals("SELESAI")) {
            selectedMenu = in.next();
            switch (selectedMenu) {
                case "TAMBAH_WITH_ISBN": {
                    String judul = in.next();
                    String kategori = in.next();
                    String ISBN = in.next();
                    shelf[bookCounter++] = new Book(judul, kategori, ISBN);
                    break;
                }
                case "TAMBAH_WITHOUT_ISBN": {
                    String judul = in.next();
                    String kategori = in.next();
                    shelf[bookCounter++] = new Book(judul, kategori);
                    break;
                }
                case "HITUNG_PER_KATEGORI": {
                    String kategori = in.next();
                    int result = Book.hitungBukuPerKategori(shelf, kategori);
                    System.out.printf("Kategori %s ada sebanyak %d buku\n", kategori, result);
                    break;
                }
                case "CETAK_TERAKHIR": {
                    Book.cetakBukuTerakhir(shelf);
                    break;
                }
            }
        }
    }
}
