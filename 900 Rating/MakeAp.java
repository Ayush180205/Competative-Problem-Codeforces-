import java.util.*;

public class MakeAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            boolean possible = false;

            if((2*b - c) > 0 && (2*b - c) % a == 0) possible = true;
            if((2*b - a) > 0 && (2*b - a) % c == 0) possible = true;
            if((a+c) % 2*b == 0) possible = true;

            System.out.println(possible ? "YES" : "NO");
            
        }
    }
}
