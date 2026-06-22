import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            int count = 0;
            for(int i=0;i<n;i++){
                if(set.contains(arr[i])) count++;
                set.add(arr[i]);
            }
            System.out.println(count);
        }
    }
}
