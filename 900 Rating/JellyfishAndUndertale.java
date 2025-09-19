import java.util.*;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long timer = sc.nextLong();
            long curr = sc.nextLong();
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long time = curr;
            for (int i = 0; i < n; i++) {
                time += Math.min(arr[i], timer - 1);
            }

            System.out.println(time);

        }
    }
}
