import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombTest {
    Romb romb;

    @BeforeTest
    public void setup() {
        this.romb = new Romb();
    }
    @Test
    public void testCalcArea() {
        double actual = this.romb.calcArea(90.0);
        double expected = 2704.3399073916876;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
    @Test
    public void testCalcRange() {
        double actual2 = this.romb.calcRange(55.0);
        double expected2 = 220.0;
        Assert.assertEquals(actual2, expected2, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
    @Test
    public void testCalcAreaFailForSure() {
        double actual3 = this.romb.calcArea(90.0);
        double expected3 = 1.0;
        Assert.assertEquals(actual3, expected3, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    } // ez nem fog igy mukodni de mindegy
    @Test
    public void testCalcRangeFailForSure() {
        double actual4 = this.romb.calcRange(55.0);
        double expected4 = 1.0;
        Assert.assertEquals(actual4, expected4, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    } // ez se
}
