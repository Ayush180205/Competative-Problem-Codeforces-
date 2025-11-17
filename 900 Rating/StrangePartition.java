import java.util.*;

public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextInt();
            long[] arr = new long[n];
            long total = 0;
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                arr[i] = curr;
                total += curr;
            }
            long max = 0L;
            long min = (total + x - 1)/x;
            for(int i=0;i<n;i++){
                long curr = arr[i];
                long val = curr / x;
                max += val;
                if(curr % x != 0) max++;
            }
            System.out.println(min+" "+max);
        }
    }
}
