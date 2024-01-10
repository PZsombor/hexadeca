import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Hexadecagon;

public class HexadecagonTest {
    Hexadecagon hexadecagon;

    @BeforeTest
    public void setUp() {
        this.hexadecagon = new Hexadecagon();
    }

    @Test
    public void testCalcArea() {
        double actual = this.hexadecagon.calcArea(30.0);
    }

}
