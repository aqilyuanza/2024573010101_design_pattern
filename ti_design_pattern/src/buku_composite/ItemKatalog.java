package buku_composite;

import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class ItemKatalog {

    private String nama;
    private double harga;
    private boolean isKategori;          // true = kategori, false = produk tunggal
    private List<ItemKatalog> subItem;   // hanya dipakai jika isKategori = true

    // Constructor
    public ItemKatalog(String nama, double harga, boolean isKategori) {
        this.nama = nama;
        this.harga = harga;
        this.isKategori = isKategori;

        if (isKategori) {
            this.subItem = new ArrayList<>();
        }
    }

    // Menambahkan sub-item
    public void tambahSubItem(ItemKatalog item) {

        if (this.isKategori) {
            this.subItem.add(item);
        } else {
            System.out.println("Error: produk tunggal tidak bisa punya sub-item!");
        }
    }

    // Menghitung total harga
    public double hitungTotalHarga() {

        if (!this.isKategori) {
            return this.harga;
        }

        double total = 0;

        for (ItemKatalog item : this.subItem) {
            total += item.hitungTotalHarga();
        }

        return total;
    }

    // Format rupiah
    private String formatRupiah(double angka) {

        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indonesia);

        return rupiah.format(angka);
    }

    // Menampilkan katalog
    public void tampilkan(int level) {

        String indentasi = "   ".repeat(level);

        if (!this.isKategori) {

            System.out.println(
                    indentasi + "- " + nama +
                            " (" + formatRupiah(harga) + ")"
            );

        } else {

            System.out.println(indentasi + "[" + nama + "]");

            for (ItemKatalog item : this.subItem) {
                item.tampilkan(level + 1);
            }
        }
    }
}