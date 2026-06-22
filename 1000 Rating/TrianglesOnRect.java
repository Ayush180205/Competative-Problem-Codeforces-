import java.util.*;

public class TrianglesOnRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int max = 0;
            for (int i = 0; i < 2; i++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                }
                int diff = arr[n-1] - arr[0];
                max = Math.max(max,diff*h);
            }
            for (int i = 0; i < 2; i++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
                }
                int diff = arr[n-1] - arr[0];
                max = Math.max(max,diff*w);
            }
            System.out.println(max);
        }
        sc.close();
    }
}
