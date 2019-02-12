package model.food;

public class Vegetable extends Aliment {

    protected String vitamins;

    public Vegetable(String name, int calNumber, String vitamins) {
        super(name, calNumber);
        this.vitamins = vitamins;
    }
}
