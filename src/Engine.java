public class Engine {
    private int horsePower;
    private int weight;
    private int mileage;

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

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }
    public Engine copy(){
      return  new Engine(horsePower,weight,mileage);
    }
}
