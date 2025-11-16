import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            if((n & (n-1)) == 0) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
