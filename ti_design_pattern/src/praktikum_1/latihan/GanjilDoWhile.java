package praktikum_1.latihan;

public class GanjilDoWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil 1-20 (do-while):");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
