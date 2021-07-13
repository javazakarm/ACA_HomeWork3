public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(220, 3500, 100_000);
        Car car = new Car(1950, "Escalade", "Cadillac", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower()); // Must not be changed as car object is immutable
    }
}
