import java.util.*;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            Set<Character> set = new HashSet<>();
            long[] pre = new long[(int)n+1];
            long[] suf = new long[(int)n+1];
            for(int i=1;i<=n;i++){
                set.add(str.charAt(i-1));
                pre[i] = set.size();
            }
            set.clear();
            for(int i=n;i>=1;i--){
                set.add(str.charAt(i-1));
                suf[i] = set.size();
            }
            long ans = 0;
            for(int i=0;i<n;i++){
                ans = Math.max(ans, pre[i]+suf[i+1]);
            }
            System.out.println(ans);
        }
    }
}
