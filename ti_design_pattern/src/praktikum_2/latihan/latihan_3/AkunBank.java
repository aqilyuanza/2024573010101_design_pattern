package praktikum_2.latihan.latihan_3;

public class AkunBank {
    // Atribut private
    private double saldo;
    // Method untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    // Method untuk mengisi saldo (biar bisa diubah dari luar)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
