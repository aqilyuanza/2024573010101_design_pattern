package praktikum_2.latihan.latihan_5;

public class Barang {
    private String namaBarang;
    private int harga;
    // Default Constructor
    public Barang() {
        namaBarang = "Unknown";
        harga = 0;
    }
// Parameterized Constructor
public Barang(String namaBarang, int harga) {
    this.namaBarang = namaBarang;
    this.harga = harga;
}
    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }

}
