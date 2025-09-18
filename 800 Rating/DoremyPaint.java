import java.util.*;

public class DoremyPaint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1); // ✅ fixed
            }

            if (freq.size() == 1) {
                System.out.println("Yes");
            } else if (freq.size() > 2) {
                System.out.println("No");
            } else {
                List<Integer> keys = new ArrayList<>(freq.keySet());
                int a = keys.get(0), b = keys.get(1);
                int c1 = freq.get(a), c2 = freq.get(b);

                if (Math.abs(c1 - c2) <= 1) System.out.println("Yes");
                else System.out.println("No");
            }
        }
        sc.close();
    }
}