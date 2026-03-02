package modul_1.latihan;

public class GanjilWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil 1-20 (while):");
        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
