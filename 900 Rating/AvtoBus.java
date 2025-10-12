import java.util.*;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if (n < 4 || n % 2 != 0) {
                System.out.println(-1);
                continue;
            }
            
            long minBuses = (n + 5) / 6;
            long maxBuses = n / 4;
            
            if (minBuses > maxBuses) {
                System.out.println(-1);
            } else {
                System.out.println(minBuses + " " + maxBuses);
            }
        }
    }
}
