package praktikum_3.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setMerk("Honda");
        motor1.setTahun(2022);
        System.out.println("Merk Motor: " + motor1.getMerk());
        System.out.println("Tahun Motor: " + motor1.getTahun());
    }
}
