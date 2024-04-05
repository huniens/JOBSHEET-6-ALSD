/**
 * Hotel
 */
public class Hotel {
    private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    // Getter dan setter (diabaikan untuk kesederhanaan)

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }
    
}