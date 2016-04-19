package junitDemoPackage;

public class Triangle {

    public Triangle() {
    }

    public enum Type {
        EQUILATERAL, INVALID, ISOSCELES, SCALENE
    }

    public static Type classify(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return Type.INVALID;
        }
        if (a == b && b == c) {
            return Type.EQUILATERAL;
        }
        if (b == c || a == b || c == a) {
            return Type.ISOSCELES;
        }
        return Type.SCALENE;
    }

    private static boolean isTriangle(int a, int b, int c) {
        // TODO fix the code to get a valid triangle!
        return (a + b) > c;
    }
}
