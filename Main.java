/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        ClassMahasiswa m1 = new ClassMahasiswa("Nusa", 2017, 25, 3);
        ClassMahasiswa m2 = new ClassMahasiswa("Rara", 2012, 19, 4);
        ClassMahasiswa m3 = new ClassMahasiswa("Dompu", 2018, 19, 3.5);
        ClassMahasiswa m4 = new ClassMahasiswa("Abdul", 2017, 23, 2);
        ClassMahasiswa m5 = new ClassMahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
    }
}