package tests;

import model.Zoo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static data.MyZookeepers.*;

public class ZookeepersTests {

    @Test(groups = {"functest"})
    public void testZookeepersWorkingHours() {
        Zoo zoo = new Zoo();
        zoo.addZookeepers(nate, mike, julien);
        zoo.displayListOfZookeepers();

        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < zoo.getNoOfZookeepers(); i++) {
            softAssert.assertTrue(zoo.validateWorkingHours(i), "The zookeeper with number: " + i + " is NOT respecting the schedule");
        }
        softAssert.assertAll();
    }

    @DataProvider(name = "testing")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{"Nate", new Integer(0)}
        };
    }

    @Test(dataProvider = "testing")
    public void testWorkingHoursMatch(String zookeeperName, int zookeeperNumber) {
        Zoo zoo = new Zoo();
        zoo.addZookeepers(nate, mike, julien);
        Assert.assertTrue(zoo.validateWorkingHours(zookeeperNumber), "This zookeeper is not respecting his schedule");
        Assert.assertEquals(zoo.getZookeeperName(zookeeperNumber), zookeeperName, "This is NOT the zookeeper from position " + zookeeperNumber);
    }
}
