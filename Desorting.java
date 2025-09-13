import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();
            int min = Integer.MAX_VALUE;
            boolean bad = false;
            for (int i = 1; i < size; i++) {
                if (arr[i] < arr[i - 1]) {
                    bad = true;
                    break;
                }
                int curr = arr[i] - arr[i - 1];
                min = Math.min(min, curr);

            }
            if(bad) System.out.println(0);
            else System.out.println(min/2 + 1);
        }
        sc.close();
    }
}
