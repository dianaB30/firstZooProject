package tests;

import model.Zoo;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static data.MyAnimals.*;
import static data.MyZookeepers.*;

public class AnimalsTests {

    @Test(groups = {"functest"})
    public void testMenMinutes() {
        Zoo zoo = new Zoo();
        zoo.addAnimals(hedgehog, tiger, zebra, snake, bear, elephant, monkey);
        zoo.displayListOfAnimals();
        zoo.addZookeepers(nate, mike, julien);
        zoo.displayListOfZookeepers();

        Assert.assertTrue(zoo.getTotalMenHoursForAllAnimals() > 10, "The total number of men hours is not bigger than 10");
        Assert.assertTrue(zoo.getTotalWorkingHoursForAllZookeepers() > zoo.getTotalMenHoursForAllAnimals(), "This zoo needs more zookeepers!");
    }

    @Test(groups = {"functest"})
    public void testAnimalsList() {
        // Step: display the list of Animals
        Zoo zoo = new Zoo();

        // Step: Display animals in list
        zoo.addAnimals(hedgehog, tiger, zebra, snake, bear, elephant, monkey);
        zoo.displayListOfAnimals();

        // Step: Remove one animal from list and display the new list
        zoo.removeAnimal(hedgehog);
    }

    @Test(groups = {"functest"})
    @Parameters({"animalName"})
    public void testAnimalName(String animalName) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(hedgehog, tiger, zebra, snake, bear, elephant, monkey);
        Assert.assertEquals(zoo.getAnimal(6), animalName, "This not the name of the animal");
    }
}
