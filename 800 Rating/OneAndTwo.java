import java.util.*;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                arr[i] = curr;
                if(curr == 2) count++;
            }
            if(count % 2 != 0){
                System.out.println(-1);
                continue;
            }

            int prefixTwos = 0;
            int target = count / 2;
            int answer = -1;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) prefixTwos++;
                if (prefixTwos == target) {
                    answer = i + 1; // 1-based index
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
