public class HW_04_2042024 {
    public static void main(String[] args) {
        double x = 10.0d;
        double y = 12.4d;
        double z = 56.78d;

        double expression = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        System.out.println("The answer for the expression is -->"   + expression );

    }
}
