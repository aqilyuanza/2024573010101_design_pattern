package praktikum_6.praktikum_2.latihan;

public class Main {

    public static void beginTrip(Navigable vehicle, String destination) {
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bike = new Bicycle();

        System.out.println("=== Car Trip ===");
        car.startEngine();
        beginTrip(car, "Central Park");

        System.out.println("\n=== Bicycle Trip ===");
        beginTrip(bike, "Central Park");
    }
}
