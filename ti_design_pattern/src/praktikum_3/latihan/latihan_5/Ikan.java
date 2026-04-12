package praktikum_3.latihan.latihan_5;

class Ikan extends HewanAir implements Berenang {
    Ikan(String nama) {
        super(nama);
    }
    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }
    @Override
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}
