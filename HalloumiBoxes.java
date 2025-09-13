import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int len = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = sc.nextInt();
            }
            if(k > 1) System.out.println("YES");
            else{
                boolean sorted = true;
                for(int i=1;i<len;i++){
                    if(arr[i] < arr[i-1]){
                        sorted = false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            }
        }
    }
}
