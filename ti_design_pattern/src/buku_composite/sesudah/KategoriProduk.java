package buku_composite.sesudah;

import java.util.ArrayList;
import java.util.List;

public class KategoriProduk implements KomponenKatalog {

    private String nama;
    private List<KomponenKatalog> children = new ArrayList<>();

    public KategoriProduk(String nama) {
        this.nama = nama;
    }

    public void tambah(KomponenKatalog komponen) {
        children.add(komponen);
    }

    public void hapus(KomponenKatalog komponen) {
        children.remove(komponen);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public double getHarga() {
        return hitungTotalHarga();
    }

    @Override
    public void tampilkan(int level) {

        String indent = "  ".repeat(level);

        System.out.printf(
                "%s[Kategori] %s (%d item)%n",
                indent, nama, children.size());

        for (KomponenKatalog child : children) {
            child.tampilkan(level + 1);
        }
    }

    @Override
    public double hitungTotalHarga() {

        double total = 0;

        for (KomponenKatalog child : children) {
            total += child.hitungTotalHarga();
        }

        return total;
    }
}