package praktikum_6.praktikum_2.latihan;

public class Car extends EngineVehicle {

    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating car route to " + destination);
        System.out.println("Following route to " + destination);
    }
}
