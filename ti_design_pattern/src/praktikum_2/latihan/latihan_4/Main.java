package praktikum_2.latihan.latihan_4;

public class Main {
    public static void main(String[] args) {
// Membuat object
        Mahasiswa mhs = new Mahasiswa();
// Mengisi nilai dengan setter
        mhs.setNama("Budi");
        mhs.setNim("2212345");
// Menampilkan dengan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
    }

}
