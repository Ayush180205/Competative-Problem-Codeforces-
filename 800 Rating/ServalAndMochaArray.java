import java.util.*;

public class ServalAndMochaArray {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean ok = false;

            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(arr[i],arr[j]) <= 2){
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if(ok) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
