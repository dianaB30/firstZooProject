package model.food;

public class Fruit extends Aliment {
    protected int carbs;

    public Fruit(String name, int calNumber, int carbs) {
        super(name, calNumber);
        this.carbs = carbs;
    }

    public int getCarbs() {
        return carbs;
    }
}


