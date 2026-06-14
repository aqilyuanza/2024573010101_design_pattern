package buku_composite.sesudah;

public class MainApp {

    public static void main(String[] args) {

        // Produk (Leaf)
        Produk samsungA55 =
                new Produk("Samsung Galaxy A55", 3_500_000, "HP-001");

        Produk iphone15 =
                new Produk("iPhone 15", 14_000_000, "HP-002");

        Produk asusVivobook =
                new Produk("ASUS VivoBook 15", 8_500_000, "LP-001");

        Produk macbookAir =
                new Produk("MacBook Air M2", 16_500_000, "LP-002");

        Produk batikTulis =
                new Produk("Batik Tulis Premium", 450_000, "FS-001");

        Produk kemejaPria =
                new Produk("Kemeja Formal Pria", 250_000, "FS-002");

        // Kategori
        KategoriProduk catHandphone = new KategoriProduk("Handphone");
        catHandphone.tambah(samsungA55);
        catHandphone.tambah(iphone15);

        KategoriProduk catLaptop = new KategoriProduk("Laptop");
        catLaptop.tambah(asusVivobook);
        catLaptop.tambah(macbookAir);

        KategoriProduk catElektronik = new KategoriProduk("Elektronik");
        catElektronik.tambah(catHandphone);
        catElektronik.tambah(catLaptop);

        KategoriProduk catFashion = new KategoriProduk("Fashion");
        catFashion.tambah(batikTulis);
        catFashion.tambah(kemejaPria);

        KategoriProduk tokoOnline = new KategoriProduk("Toko Online Kita");
        tokoOnline.tambah(catElektronik);
        tokoOnline.tambah(catFashion);

        // Tampilkan katalog
        System.out.println("=== KATALOG PRODUK ===================");
        tokoOnline.tampilkan(0);

        // Hitung total harga
        System.out.println();
        System.out.println("=== TOTAL HARGA ======================");

        System.out.printf("Total Handphone : Rp %,.0f%n",
                catHandphone.hitungTotalHarga());

        System.out.printf("Total Laptop    : Rp %,.0f%n",
                catLaptop.hitungTotalHarga());

        System.out.printf("Total Elektronik: Rp %,.0f%n",
                catElektronik.hitungTotalHarga());

        System.out.printf("Total Fashion   : Rp %,.0f%n",
                catFashion.hitungTotalHarga());

        System.out.printf("TOTAL TOKO      : Rp %,.0f%n",
                tokoOnline.hitungTotalHarga());

        // Perlakuan sama antara Produk dan Kategori
        System.out.println();
        System.out.println("=== HARGA SATU PRODUK ================");

        KomponenKatalog produkApapun = samsungA55;

        System.out.printf("Harga %s: Rp %,.0f%n",
                produkApapun.getNama(),
                produkApapun.hitungTotalHarga());
    }
}n
