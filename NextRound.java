import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        int kthscore = arr[target-1];
        for(int score : arr){
            if(score >= kthscore && score > 0) ans++;
        }
        System.out.println(ans);
    }
}
