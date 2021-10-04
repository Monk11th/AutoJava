package HW4;

public class Triangle {
    public static double calculateSquare(int a, int b, int c) throws Exception {
        if ( a <= 0 || b <= 0 || c <= 0) throw new Exception();
        if (a + b < c || a + c < b || b + c < a) throw new Exception();
        double halfPer = (a + b + c) / 2;
        return (halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }
}
