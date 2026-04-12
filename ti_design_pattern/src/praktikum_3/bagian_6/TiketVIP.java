package praktikum_3.bagian_6;

class TiketVIP extends Tiket {
    public TiketVIP() {
        super ("VIP", 250000);
    }
    @Override
    public double hitungDiskon() {
        return 0.1* getHarga();
    }
}