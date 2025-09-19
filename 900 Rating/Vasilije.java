import java.util.*;

public class Vasilije {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long minsum = k * (k+1) / 2;
            long maxsum = k * (2*n-k+1) / 2;

            if(x >= minsum && x <= maxsum) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
