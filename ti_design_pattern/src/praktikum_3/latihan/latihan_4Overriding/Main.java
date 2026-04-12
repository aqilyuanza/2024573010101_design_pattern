package praktikum_3.latihan.latihan_4Overriding;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
    }
}
