public final class Car {
    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine.getHorsePower(), engine.getWeight(), engine.getMileage());
    }

    public Engine getEngine() {
        return engine;
    }

}
