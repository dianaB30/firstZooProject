package model.food;

import java.util.ArrayList;
import java.util.List;

public class Diet {

    protected List<Fruit> fruits;
    protected List<Vegetable> vegetables;
    protected List<Meat> meats;

    public Diet() {
        fruits = new ArrayList<>();
        vegetables = new ArrayList<>();
        meats = new ArrayList<>();
    }

    // fruits
    public boolean addFruit(Fruit fruit) {
        if (fruit != null) {
            fruits.add(fruit);
            return true;
        } else {
            return false;
        }
    }

    public int addFruits(Fruit... fruits) {
        int count = 0;
        for (Fruit fruit : fruits) {
            if (addFruit(fruit)) {
                count++;
            }
        }
        return count;
    }

    public boolean removeFruit(Fruit fruit) {
        if (fruit != null) {
            int nr = getNoOfFruits();
            fruits.remove(fruit);
            return nr == getNoOfFruits() + 1;
        } else {
            return false;
        }
    }

    public int getNoOfFruits() {
        return fruits.size();
    }

    // vegetables
    public boolean addVegetable(Vegetable vegetable) {
        if (vegetable != null) {
            vegetables.add(vegetable);
            return true;
        } else {
            return false;
        }
    }

    public int addVegetables(Vegetable... vegetables) {
        int count = 0;
        for (Vegetable vegetable : vegetables) {
            if (addVegetable(vegetable)) {
                count++;
            }
        }
        return count;
    }

    public boolean removeVegetable(Vegetable vegetable) {
        if (vegetable != null) {
            int nr = getNoOfFruits();
            vegetables.remove(vegetable);
            return nr == getNoOfVegetables() + 1;
        } else {
            return false;
        }
    }

    public int getNoOfVegetables() {
        return vegetables.size();
    }

    // meats
    public boolean addMeat(Meat meat) {
        if (meat != null) {
            meats.add(meat);
            return true;
        } else {
            return false;
        }
    }

    public int addMeats(Meat... meats) {
        int count = 0;
        for (Meat meat : meats) {
            if (addMeat(meat)) {
                count++;
            }
        }
        return count;
    }

    public boolean removeMeat(Meat meat) {
        if (meat != null) {
            int nr = getNoOfMeats();
            meats.remove(meat);
            return nr == getNoOfMeats() + 1;
        } else {
            return false;
        }
    }

    public int getNoOfMeats() {
        return meats.size();
    }
}
