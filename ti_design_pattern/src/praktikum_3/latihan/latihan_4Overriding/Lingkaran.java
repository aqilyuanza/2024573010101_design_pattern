package praktikum_3.latihan.latihan_4Overriding;

public class Lingkaran extends Bangundatar {
    double jariJari = 7;
    @Override
    double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
}
