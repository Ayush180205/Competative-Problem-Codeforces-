import java.util.*;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int maxlen = 1;
            int currlen = 1;
            for(int i=1;i<n;i++){
                if(Math.abs(arr[i] - arr[i-1]) <= k){
                    currlen++;
                }else{
                    currlen = 1;
                }
                maxlen = Math.max(maxlen, currlen);
            }
            System.out.println(n - maxlen);
        }
    }
}
