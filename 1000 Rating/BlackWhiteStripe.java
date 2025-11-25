import java.util.*;

public class BlackWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            String str = sc.next();

            long[] prefix = new long[(int)n+1];
            for(int i=0;i<n;i++){
                prefix[i+1] = prefix[i] + (str.charAt(i) == 'W' ? 1 : 0);
            }
            
            long ans = Long.MAX_VALUE;
            for(int i=0;i<=n-k;i++){
                long diff = prefix[i+(int)k] - prefix[i];
                ans = Math.min(diff,ans);
            }
            System.out.println(ans);
        }
    }
}
