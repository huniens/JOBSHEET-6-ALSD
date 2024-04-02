/**
 * DaftarMahasiswaBerprestasi
 */
public class DaftarMahasiswaBerprestasi {

    ClassMahasiswa listMhs[] = new ClassMahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(ClassMahasiswa m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(ClassMahasiswa m : listMhs) {
            m.tampil();
            System.out.println("-------------------");
        }
    }

    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    ClassMahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                    
                }
            }
        }
    }
}