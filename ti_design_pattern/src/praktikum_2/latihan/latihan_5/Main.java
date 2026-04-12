package Praktikum_2.Latihan.Latihan_5;

import praktikum_2.bagian_5.Person;
import praktikum_2.latihan.latihan_5.Barang;

public class Main {
    public static void main(String[] args) {
// Object Person (dari soal sebelumnya)
        Person person1 = new Person();
        Person person2 = new Person("Budi", 25);
        person1.tampilkanInfo();
        person2.tampilkanInfo();

// Object Barang
        Barang barang1 = new Barang();
        Barang barang2 = new Barang("Laptop", 7000000);
        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
    }
}