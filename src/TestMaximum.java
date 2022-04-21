import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Three Numbers to check Maximum ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


    }

    public static <T extends Integer> T maxOfNumber(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max);
        return max;
    }
}
