public class Main {
    private static final double PI = Math.PI;
    public static void main(String[] args) {
        System.out.println("This is just an output!");
    }

    public static double area (double radius) {
        if (radius < 0) return -1;

        return (radius * radius) * PI;
    }

    public static double area (double x, double y) {
        if( x<0 || y<0 ) return -1;

        return x * y;
    }
}