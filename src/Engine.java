public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;

    public Engine() {

    }

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMileage() {
        return mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine copy() {
        Engine copyEngine = new Engine();
        copyEngine.setHorsePower(horsePower);
        copyEngine.setMileage(mileage);
        copyEngine.setWeight(weight);
        return copyEngine;
    }
}
