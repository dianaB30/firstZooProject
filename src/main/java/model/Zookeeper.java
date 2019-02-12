package model;

public class Zookeeper {

    protected String name;
    public int workingHoursPerWeek;
    public int maxWorkingHoursPerDay;
    public boolean saturday;
    public boolean sunday;


    public Zookeeper(String name, int workingHoursPerWeek, int maxWorkingHoursPerDay, boolean saturday, boolean sunday) {
        this.name = name;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.maxWorkingHoursPerDay = maxWorkingHoursPerDay;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public String getName() {
        return name;
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public int getMaxWorkingHoursPerDay() {
        return maxWorkingHoursPerDay;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public boolean isSunday() {
        return sunday;
    }
}
