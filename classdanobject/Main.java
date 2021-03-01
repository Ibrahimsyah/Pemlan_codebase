package classdanobject;

public class Main {

    public static void main(String[] args) {
        int angka = 1;
        
        Human human1 = new Human("Manusia", 20, 170, 50);
        System.out.println(human1.getNama());

//        human1.setNama("Manusia Super");
//        System.out.println(human1.getNama());
//        
//        human1.setNama("Manusia Sangat Super");
//        System.out.println(human1.getNama());
        Book bukuBaru1 = new Book("Interstellar", "Sci-fi"); //Membuat buku baru
        human1.setBuku(bukuBaru1); // Memberikan buku baru tersebut ke human1
        
        Book human1Book = human1.getBuku();
        System.out.println("Buku dari human1: " + human1Book.getNama());
        
        int[] arrayOfInt = new int[5]; // isi: [int, int, int, int, int]
        arrayOfInt[0] = 20;
        System.out.println(arrayOfInt[0]); //Output: 20
        
        Book[] bookCollection = new Book[5]; // [bukuBaru1, bukuBaru2, Book,Book, Book];
        Book bukuBaru2 = new Book("Avengers: Endgame", "Sci-Fi");
        bookCollection[0] = bukuBaru1;
        bookCollection[1] = bukuBaru2;
        System.out.println(bookCollection[0].getNama()); //Output: Interstellar
        System.out.println(bookCollection[1].getNama()); //Output: Avengers: Endgame
    }
}
