package model;

import java.util.ArrayList;

public class Zoo {

    protected ArrayList<Animal> animals;
    protected ArrayList<Zookeeper> zookeepers;

    public Zoo() {
        animals = new ArrayList<>();
        zookeepers = new ArrayList<>();
    }

    // animals
    public boolean addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
            return true;
        } else {
            return false;
        }
    }

    public String getAnimal(int index) {
        return animals.get(index).getName();
    }

    public int addAnimals(Animal... animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (addAnimal(animal)) {
                count++;
            }
        }
        return count;
    }

    public boolean removeAnimal(Animal animal) {
        if (animal != null) {
            int nr = getNoOfAnimals();
            animals.remove(animal);
            return nr == getNoOfAnimals() + 1;
        } else {
            return false;
        }
    }

    public int getNoOfAnimals() {
        return animals.size();
    }

    public void displayListOfAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getName());
        }
    }

    // zookeepers
    public boolean addZookeeper(Zookeeper zookeeper) {
        if (zookeeper != null) {
            zookeepers.add(zookeeper);
            return true;
        } else {
            return false;
        }
    }

    public int addZookeepers(Zookeeper... zookeepers) {
        int count = 0;
        for (Zookeeper zookeeper : zookeepers) {
            if (addZookeeper(zookeeper)) {
                count++;
            }
        }
        return count;
    }

    public void displayListOfZookeepers() {
        for (int i = 0; i < zookeepers.size(); i++) {
            System.out.println(zookeepers.get(i).getName());
        }
    }

    public boolean isZookeeperWorkingOnSaturday(int index) {
        return zookeepers.get(index).isSaturday();
    }

    public boolean isZookeeperWorkingOnSunday(int index) {
        return zookeepers.get(index).isSunday();
    }

    public boolean getMaxWorkingHoursPerWeekIfInRange(int index) {
        if (zookeepers.get(index).getWorkingHoursPerWeek() >= 30 && zookeepers.get(index).getWorkingHoursPerWeek() < 50) {
            zookeepers.get(index).getWorkingHoursPerWeek();
            return true;
        } else {
            return false;
        }
    }

    public boolean getMaxWorkingHoursPerDayIfInRange(int index) {
        if (zookeepers.get(index).getMaxWorkingHoursPerDay() >= 4 && zookeepers.get(index).getMaxWorkingHoursPerDay() < 9) {
            zookeepers.get(index).getMaxWorkingHoursPerDay();
            return true;
        } else {
            return false;
        }
    }

    public boolean removeZookeeper(Zookeeper zookeeper) {
        if (zookeeper != null) {
            int nr = getNoOfZookeepers();
            zookeepers.remove(zookeeper);
            return nr == getNoOfZookeepers() + 1;
        } else {
            return false;
        }
    }

    public int getNoOfZookeepers() {
        return zookeepers.size();
    }

    public int workingHoursPerWeekCalculator(int index) {
        int noOfWorkingDays = 5;
        if (zookeepers.get(index).isSaturday()) {
            noOfWorkingDays++;
        }
        if (zookeepers.get(index).isSunday()) {
            noOfWorkingDays++;
        }
        return zookeepers.get(index).getMaxWorkingHoursPerDay() * noOfWorkingDays;
    }

    public boolean validateWorkingHours(int index) {
        if (workingHoursPerWeekCalculator(index) >= zookeepers.get(index).getWorkingHoursPerWeek()) {
            return true;
        } else {
            return false;
        }
    }

    public int getTotalWorkingHoursForAllZookeepers() {
        int sum = 0;
        for (int i = 0; i < zookeepers.size(); i++) {
            if (workingHoursPerWeekCalculator(i) > 0) {
                sum += workingHoursPerWeekCalculator(i);
            }
        }
        return sum;
    }

    public double getTotalMenHoursForAllAnimals() {
        double sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getMenHours() > 0) {
                sum += animals.get(i).getMenHours();
            }
        }
        return sum;
    }

    public String getZookeeperName(int i) {
        return zookeepers.get(i).getName();
    }
}







