/**
 * ClassMahasiswa
 */
public class ClassMahasiswa {

    String nama;
    int thnMASUK, umur;
    double ipk;

    ClassMahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMASUK = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMASUK);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}