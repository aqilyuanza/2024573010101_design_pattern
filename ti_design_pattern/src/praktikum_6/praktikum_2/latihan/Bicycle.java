package praktikum_6.praktikum_2.latihan;

public class Bicycle implements Navigable {

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating bike route to " + destination);
        System.out.println("Following bike route to " + destination);
    }
}