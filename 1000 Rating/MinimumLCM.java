import java.util.*;

public class MinimumLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long a = 1, b = n-1;
            for(int fac=2;fac*fac<=n;fac++){
                if(n%fac == 0){
                    a = n / fac;
                    b = n - a;
                    break;
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
