package praktikum_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
// Membuat object
        AkunBank akun = new AkunBank();
// Mengisi saldo lewat method
        akun.setSaldo(1000000);
// Menampilkan saldo
        akun.tampilkanSaldo();
        // Ini akan error jika diaktifkan
// akun.saldo = 500000;
    }
}

