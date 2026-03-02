package modul_1.latihan;

public class GanjilFor {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil 1-20 (for):");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
