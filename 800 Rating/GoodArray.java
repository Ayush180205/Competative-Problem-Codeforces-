import java.util.*;

public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long operation = 0;
            for(int i=1;i<n;i++){
                if((arr[i]%2) == arr[i-1]%2){
                    operation++;
                }
            }
            System.out.println(operation);
        }
    }
}
