import java.util.*;

public class DaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[size];
            boolean found = false;
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
                if(arr[i] == n){
                    found = true;
                }
            }
            if(!found) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
