package tests;

import data.Constants;
import model.food.Diet;
import model.food.Fruit;
import model.food.Meat;

public class ZooValidations {

    public boolean atLeastOneAlimentInDiet(Diet diet) throws Exception {
        if (diet.getNoOfFruits() > 0) {
            return true;
        } else if (diet.getNoOfVegetables() > 0) {
            return true;
        } else if (diet.getNoOfMeats() > 0) {
            return true;
        } else {
            throw new Exception("The diet has No aliment");
        }
    }

    public boolean isCarbsNumberBiggerThan(Fruit fruit, int number) {
        return fruit.getCarbs() > number;
    }

    public boolean isProteinsNumberInRange(Meat meat) {
        return meat.getProteins() > Constants.MIN_PROTEINS_RANGE && meat.getProteins() < Constants.MAX_PROTEINS_RANGE;
    }
}
