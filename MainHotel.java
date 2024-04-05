/**
 * MainHotel
 */
public class MainHotel {

    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);

        
        hotelService.tambah(new Hotel("Hotel A", "Batam", 500000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Malang", 300000, (byte) 3));
        hotelService.tambah(new Hotel("Hotel C", "Yogyakarta", 800000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel D", "Surabaya", 400000, (byte) 2));
        hotelService.tambah(new Hotel("Hotel E", "Bali", 1000000, (byte) 5));

        System.out.println("Daftar Hotel sebelum sorting:");
        hotelService.tampilAll();

        
        hotelService.bubbleSortByHarga();
        System.out.println("\nDaftar Hotel setelah sorting berdasarkan harga:");
        hotelService.tampilAll();

        
        hotelService.selectionSortByBintang();
        System.out.println("\nDaftar Hotel setelah sorting berdasarkan bintang:");
        hotelService.tampilAll();
    }
}
