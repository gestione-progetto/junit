package junitDemoPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testEquilater() {
        assertEquals(Triangle.Type.EQUILATERAL, Triangle.classify(1, 1, 1));
    }

    // TODO - write a set of test cases: EQUILATERAL, ISOSCELES, SCALENE, INVALID
}
