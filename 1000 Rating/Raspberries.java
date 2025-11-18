import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long ans = Integer.MAX_VALUE;
            long evencount = 0;
            for(int i=0;i<n;i++){
                if(arr[i] % 2 == 0){
                    evencount++;
                }
                if(arr[i] % k == 0){
                    ans = 0;
                }
                ans = Math.min(ans, (k - (arr[i] % k)));
            }
            if(k == 4){
                if(evencount >= 2) ans = Math.min(ans, 0L);
                else if(evencount == 1) ans = Math.min(ans, 1L);
                else if(evencount == 0) ans= Math.min(ans, 2L);
            }
            System.out.println(ans);
        }
    }
}
