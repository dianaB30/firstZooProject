package data;

import model.food.*;

public class MyFood {

    //Fruit
    public static final Fruit orange = new Fruit("aurantiaco", 47, 12);
    public static final Fruit banana = new Fruit("ariera", 89,12);
    public static final Fruit apple = new Fruit("malum",52,14);
    public static final Fruit pear = new Fruit("pirum",57,15);

    //Vegetable
    public static final Vegetable carrot = new Vegetable("carrot",41,"A, B6, K");
    public static final Vegetable potato = new Vegetable("potato", 77,"C, K, B6");
    public static final Vegetable tomato = new Vegetable("tomato",18,"C, K");
    public static final Vegetable cucumber = new Vegetable("cucumber", 16,"C, K, Mg");

    //Meat
    public static final Meat pork = new Meat("pork",242,27);
    public static final Meat chicken = new Meat("chicken",239,31);
    public static final Meat turkey = new Meat("turkey", 189,29);

    //Diet
    public static Diet vegan = new Diet();
    public static Diet meatOnly = new Diet();
    public static Diet fruitOnly = new Diet();

    static {
        vegan.addVegetables(carrot, potato, tomato, cucumber);
        meatOnly.addMeats(pork, chicken, turkey);
        fruitOnly.addFruits(orange, banana, apple, pear);
    }
}
