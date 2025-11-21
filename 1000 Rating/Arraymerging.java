import java.util.*;

public class Arraymerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] a = new long[(int)n];
            long[] b = new long[(int)n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            for(int i=0;i<n;i++) b[i] = sc.nextLong();

            long[] bestA = new long[(int)(2*n+1)];
            long[] bestB = new long[(int)(2*n+1)];

            int run = 1;
            for(int i=1;i<n;i++){
                if(a[i] == a[i-1]) run++;
                else{
                    bestA[(int)a[i-1]] = Math.max(bestA[(int)a[i-1]],run);
                    run = 1;
                }
            }
            bestA[(int)a[(int)n-1]] = Math.max(bestA[(int)a[(int)n-1]],run);

            run = 1;
            for(int i=1;i<n;i++){
                if(b[i] == b[i-1]) run++;
                else{
                    bestB[(int)b[i-1]] = Math.max(bestB[(int)b[i-1]],run);
                    run = 1;
                }
            }
            bestB[(int)b[(int)n-1]] = Math.max(bestB[(int)b[(int)n-1]],run);

            long ans = -1;
            for(int i=1;i<=2*n;i++){
                ans = Math.max(ans, bestA[i] + bestB[i]);
            }
            System.out.println(ans);
        }
    }
}
