package tests;

import model.Zoo;
import org.testng.Assert;
import org.testng.annotations.Test;
import static data.MyAnimals.*;
import static data.MyFood.*;
import static data.MyZookeepers.*;

public class ZooTests {

    @Test
    public void test1() throws Exception {

        // Step: display the list of Animals
        Zoo zoo = new Zoo();
        zoo.displayListOfAnimals();

        // Step: Display animals in list
        zoo.addAnimals(hedgehog, tiger, zebra, snake, bear, elephant, monkey);
        zoo.addZookeepers(nate, mike, julien);

        // Step: Display list of zookeepers
        zoo.displayListOfZookeepers();
        zoo.removeZookeeper(mike);
        zoo.displayListOfZookeepers();

        // Step: Display list of animals
        zoo.displayListOfAnimals();
        zoo.removeAnimal(zebra);
        zoo.displayListOfAnimals();
        Assert.assertNotNull(zebra.getMenHours(), "There is no information about maintenance time for zebra");

        // Step: remove aliments from diets
        vegan.removeVegetable(carrot);
        meatOnly.removeMeat(pork);
        fruitOnly.removeFruit(orange);

        Assert.assertTrue(zoo.isZookeeperWorkingOnSunday(1), "This zookeeper is NOT working on sunday");
        Assert.assertTrue(zoo.isZookeeperWorkingOnSaturday(0), "This zookeeper is NOT working on saturday");

        Assert.assertTrue(zoo.getMaxWorkingHoursPerWeekIfInRange(0), "The zookeeper is not respecting the schedule per week");
        Assert.assertTrue(zoo.getMaxWorkingHoursPerDayIfInRange(1), "The zookeeper is not respecting the schedule per day");

        // Verify: that there is at least one aliment in the diet
        ZooValidations zooValidations = new ZooValidations();
        Assert.assertTrue(zooValidations.atLeastOneAlimentInDiet(vegan), "There is no aliment in this diet");

        // Verify: that the number of carbs is bigger than 10
        Assert.assertTrue(zooValidations.isCarbsNumberBiggerThan(orange, 10), "The number of carbs is bigger than the stated limit");

        // Verify: that the number of proteins is in range for pork meat
        Assert.assertTrue(zooValidations.isProteinsNumberInRange(pork), "The number of proteins is out of range");
    }
}
