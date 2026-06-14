package buku_composite;

public class Main {

    public static void main(String[] args) {

        // Kategori utama
        ItemKatalog elektronik = new ItemKatalog("Elektronik", 0, true);

        // Sub kategori Handphone
        ItemKatalog handphone = new ItemKatalog("Handphone", 0, true);

        handphone.tambahSubItem(
                new ItemKatalog("Samsung Galaxy A55", 3500000, false)
        );

        handphone.tambahSubItem(
                new ItemKatalog("iPhone 15", 14000000, false)
        );

        // Sub kategori Laptop
        ItemKatalog laptop = new ItemKatalog("Laptop", 0, true);

        laptop.tambahSubItem(
                new ItemKatalog("Laptop ASUS ROG", 25000000, false)
        );

        // Menambahkan sub kategori ke Elektronik
        elektronik.tambahSubItem(handphone);
        elektronik.tambahSubItem(laptop);

        // Menampilkan katalog
        System.out.println("===== KATALOG E-COMMERCE =====\n");

        elektronik.tampilkan(0);

        // Menampilkan total harga
        System.out.println("\n==============================");
        System.out.println("Total Harga Semua Produk : Rp" +
                String.format("%,.0f", elektronik.hitungTotalHarga()));
    }
}