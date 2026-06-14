package buku_composite.sesudah;

public class Produk implements KomponenKatalog {

    private String nama;
    private double harga;
    private String sku;

    public Produk(String nama, double harga, String sku) {
        this.nama = nama;
        this.harga = harga;
        this.sku = sku;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void tampilkan(int level) {

        String indent = "  ".repeat(level);

        System.out.printf(
                "%s[Produk] %-25s | SKU: %-8s | Rp %,.0f%n",
                indent, nama, sku, harga);
    }

    @Override
    public double hitungTotalHarga() {
        return harga;
    }
}