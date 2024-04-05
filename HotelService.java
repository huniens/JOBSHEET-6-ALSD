/**
 * HotelService
 */
public class HotelService {
    private Hotel[] rooms;
    private int size;

    public HotelService(int capacity) {
        rooms = new Hotel[capacity];
        size = 0;
    }

    public void tambah(Hotel h) {
        if (size < rooms.length) {
            rooms[size] = h;
            size++;
        } else {
            System.out.println("Kamar sudah penuh!");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("Nama Hotel: " + rooms[i].getNama());
            System.out.println("Kota: " + rooms[i].getKota());
            System.out.println("Harga: " + rooms[i].getHarga());
            System.out.println("Bintang: " + rooms[i].getBintang());
            System.out.println("---------------------------------------");
        }
    }

    // Bubble Sort berdasarkan harga
    public void bubbleSortByHarga() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].getHarga() > rooms[j + 1].getHarga()) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort berdasarkan bintang
    public void selectionSortByBintang() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].getBintang() > rooms[minIndex].getBintang()) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
    
}