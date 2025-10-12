import java.util.*;

public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                min = Math.min(arr[i],min);
                max = Math.max(arr[i],max);
            }
            if(n==1){
                System.out.println(0);
                continue;
            }
            long ans = 0;
            ans = Math.max(ans, max - arr[0]);
            ans = Math.max(ans, arr[n-1] - min);
            for(int i=0;i<n-1;i++){
                ans = Math.max(ans,arr[i]-arr[i+1]);
            }
            System.out.println(ans);
        }
    }
}
