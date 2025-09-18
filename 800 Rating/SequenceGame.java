import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++) arr[i] = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            ans.add(arr[0]);
            for(int i=1;i<size;i++){
                if(arr[i] < arr[i-1]){
                    ans.add(1);
                }
                ans.add(arr[i]);
            }
            System.out.println(ans.size());
            for(int a : ans){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
