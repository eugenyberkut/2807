package logic;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yevhen on 28.07.2015.
 */
public class MainTest {

    @Test
    public void testSum() throws Exception {
        System.out.println("Testing sum()");
        Main main = new Main();
        double[] a = {1.1, 3.3, -0.4, 10.0};
        double expectedResult = 14.0;
        double result = main.sum(a);
        assertEquals(expectedResult, result, 1e-6);
    }

    @Test
    public void testMax() throws Exception {
        System.out.println("Testing max()");
        Main main = new Main();
        double[] a = {1.1, 10.0, -0.4, 3.3};
        double expectedResult = 10.0;
        double result = main.max(a);
        assertEquals(expectedResult, result, 1e-6);
    }

    @Test
    public void testMin() throws Exception {
        System.out.println("Testing max()");
        Main main = new Main();
        double[] a = {1.1, 10.0, -0.4, 3.3};
        double expectedResult = -0.4;
        double result = main.min(a);
        assertEquals(expectedResult, result, 1e-6);
    }
}