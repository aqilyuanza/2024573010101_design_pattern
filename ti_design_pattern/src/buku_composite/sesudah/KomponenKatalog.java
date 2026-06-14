package buku_composite.sesudah;

public interface KomponenKatalog {

    String getNama();

    double getHarga();

    void tampilkan(int level);

    double hitungTotalHarga();
}