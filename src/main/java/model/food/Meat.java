package model.food;

public class Meat extends Aliment {
    protected int proteins;

    public Meat(String name, int calNumber, int proteins) {
        super(name, calNumber);
        this.proteins = proteins;
    }

    public int getProteins() {
        return proteins;
    }
}
