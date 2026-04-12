package praktikum_3.latihan.latihan_4Overloading;

public class Main {
    public static void main(String[] args) {
        Matematika m = new Matematika();
        System.out.println("Hasil 1: " + m.tambah(5, 10));
        System.out.println("Hasil 2: " + m.tambah(5, 10, 15));
        System.out.println("Hasil 3: " + m.tambah(3.5, 2.5));
    }
}
