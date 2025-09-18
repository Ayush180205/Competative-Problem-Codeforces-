import java.util.*;

public class TwoPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if((a==b && b==n) || a+b+2 <= n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
