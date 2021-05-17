package interfaces;

/**
 *
 * @author ibrahimsyah
 */

//Perbedaan Abstract dan Interface
//Abstract = Dia ditujukan untuk di turunkan untuk tujuan spesialisasi
//Interface = Dia ditujukan sebagai kontrak yang harus di penuhi untuk tujuan
//Integritas

public interface Vehicle {
    int KECEPATAN = 100;

    void maju();
    void mundur();
    double gerak(int jarak);
}
