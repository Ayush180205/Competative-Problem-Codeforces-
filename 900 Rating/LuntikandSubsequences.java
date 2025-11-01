import java.util.*;

public class LuntikandSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long ones = 0;
            long zeros = 0;
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++){
                Long curr = sc.nextLong();
                arr[i] = curr;
                if(curr == 1) ones++;
                if(curr == 0) zeros++;
            }

            long ans = (long)Math.pow(2, zeros) * ones;
            System.out.println(ans);
        }
    }
}
