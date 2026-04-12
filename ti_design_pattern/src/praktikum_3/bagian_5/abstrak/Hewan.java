package praktikum_3.bagian_5.abstrak;

abstract class Hewan {
    //atribut
    String nama;
    //Method konkret
    void makan () {
        System.out.println(nama + " sedang makan.");
    }
    //Method abstract
    abstract void bersuara();
}
