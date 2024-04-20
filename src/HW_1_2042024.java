public class HW_1_2042024 {
    public static void main(String[] args) {
        int a = 60;
        int b = 90;
        int c = 75;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The maximum number is: " + max);
    }
}
