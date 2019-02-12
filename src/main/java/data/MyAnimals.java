package data;

        import model.Animal;

public class MyAnimals {

    //Animal
    public static final Animal hedgehog = new Animal("Erinaceinae", MyFood.vegan, 1);
    public static final Animal tiger = new Animal("Panthera tigris", MyFood.meatOnly, 1.4);
    public static final Animal zebra = new Animal("Equus zebra", MyFood.fruitOnly, 1.3);
    public static final Animal snake = new Animal("Serpentes", MyFood.vegan, 1.2);
    public static final Animal bear = new Animal("Ursidae", MyFood.meatOnly, 2);
    public static final Animal elephant = new Animal("Loxodonta", MyFood.fruitOnly, 3);
    public static final Animal monkey = new Animal("Simia", MyFood.fruitOnly, 1.5);
}
