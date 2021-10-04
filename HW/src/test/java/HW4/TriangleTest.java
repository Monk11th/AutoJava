package HW4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static HW4.Triangle.calculateSquare;

public class TriangleTest {
    @Test
    public void normalTriangleTest() throws Exception {
        double answer = calculateSquare(3, 3, 3);
        Assertions.assertEquals(4, answer);
    }
}
