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

    


}
