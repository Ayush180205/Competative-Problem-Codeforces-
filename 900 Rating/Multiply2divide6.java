import java.util.*;

public class Multiply2divide6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int ops = 0;
            while (n != 1) {
                if (n % 6 == 0) {
                    n = n / 6;
                    ops++;
                } else {
                    n = n * 2;
                    ops++;
                }
                if (n > 1_000_000_000_000L) {
                    ops = -1;
                    break;
                }
            }
            System.out.println(ops);
        }
    }
}
