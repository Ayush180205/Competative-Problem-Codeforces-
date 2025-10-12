import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            long[] arr = new long[n+1];
            long[] prefix = new long[n+1];
            
            for(int i=1; i<=n; i++){
                arr[i] = sc.nextLong();
                prefix[i] = prefix[i-1] + arr[i];
            }
            
            long totalSum = prefix[n];
            
            while(q-- > 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                
                long rangeSum = prefix[r] - prefix[l-1];
                long newSum = totalSum - rangeSum + (long)(r - l + 1) * k;
                
                if(newSum % 2 == 1){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
