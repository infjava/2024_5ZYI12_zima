

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
    private Kalkulacka kalkulacka;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        this.kalkulacka = new Kalkulacka();
    }
    
    @Test
    public void spocitaj5a3() {
        this.kalkulacka.zadajCislo(5);
        this.kalkulacka.vypocitaj("+", 3);
        Assert.assertEquals(8, this.kalkulacka.getVysledok(), 0.001);
    }

    @Test
    public void odpocitaj5minus3() {
        this.kalkulacka.zadajCislo(5);
        this.kalkulacka.vypocitaj("-", 3);
        Assert.assertEquals(2, this.kalkulacka.getVysledok(), 0.001);
    }
}

