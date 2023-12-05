

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime(12, 12, 12);
        clockTim2 = new ClockTime(12, 12, 12);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Equals()
    {
        ClockTime clockTim1 = new ClockTime(13, 1, 1);
        ClockTime clockTim2 = new ClockTime(12, 1, 1);
        assertEquals(false, clockTim1.equals(clockTim2));
    }

    @Test
    public void Advances()
    {
        ClockTime clockTim1 = new ClockTime(12, 1, 1);
        clockTim1.advance(20);
    }

    @Test
    public void getHour()
    {
        ClockTime clockTim3 = new ClockTime(11, 11, 11);
        assertEquals(11, clockTim3.getHour());
    }

    @Test
    public void getMinute()
    {
        ClockTime clockTim1 = new ClockTime(12, 24, 12);
        assertEquals(24, clockTim1.getMinute());
    }
    
    @Test
    public void difference()
    {
        ClockTime clockTim1 = new ClockTime(12, 11, 11);
        ClockTime clockTim2 = new ClockTime(13, 0, 4);
        assertEquals(false, clockTim1.equals(clockTim2));
    }

        

    @Test
    public void getSec()
    {
        ClockTime clockTim1 = new ClockTime(12, 12, 25);
        assertEquals(25, clockTim1.getSecond());
    }

    @Test
    public void fixtureMethod1()
    {
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void fixMethod2()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(0);
        clockTim1.setSecond(0);
        assertEquals("11:00:00", clockTim1.toString());
    }
}









