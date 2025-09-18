import java.util.*;

public class TwinPermitution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int maxele = n + 1;
            int[] ans = new int[n];
            for(int i=0;i<n;i++){
                ans[i] = maxele - arr[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+ " ");
            }
            System.out.println();
        }
    }
}
