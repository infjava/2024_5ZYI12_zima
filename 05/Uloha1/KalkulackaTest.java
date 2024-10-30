

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void spocitaj5a3() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(5);
        kalkulacka.vypocitaj("+", 3);
        Assert.assertEquals(8, kalkulacka.getVysledok(), 0.001);
    }
}
