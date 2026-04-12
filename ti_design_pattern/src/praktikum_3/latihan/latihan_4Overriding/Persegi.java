package praktikum_3.latihan.latihan_4Overriding;

public class Persegi extends Bangundatar {
    double sisi = 4;
    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

