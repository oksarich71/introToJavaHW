import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    private WaterBottle waterBottle;


    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void waterDrink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void waterEmpty() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void waterFull() {
        assertEquals(100, waterBottle.full());
    }
}