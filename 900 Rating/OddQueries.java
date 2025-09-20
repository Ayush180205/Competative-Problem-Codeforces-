import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long sum = 0;
            
            for(int i=0; i<n; i++){
                sum += sc.nextLong();
            }
            
            while(q-- > 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
                
                int len = r - l + 1;
                
                long newParity;
                if(len % 2 == 0){
                    // even length -> parity stays same
                    newParity = sum % 2;
                } else {
                    // odd length -> parity flips if k is odd
                    newParity = (sum % 2 + k % 2) % 2;
                }
                
                System.out.println(newParity == 1 ? "YES" : "NO");
            }
        }
    }
}
