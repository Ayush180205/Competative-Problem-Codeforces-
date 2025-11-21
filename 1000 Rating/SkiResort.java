import java.util.*;

public class SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long min = sc.nextLong();
            long lim = sc.nextLong();
            long[] arr = new long[(int)n];
            
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                if(curr > lim) arr[i] = 0;
                else arr[i] = 1;
            }

            long one = 0;
            long ans = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 1){
                    one++;
                }else{
                    if(one >= min){
                        long diff = one - min + 1;
                        ans += (diff * (diff + 1)) / 2;
                    }
                    one = 0;
                }
            }
            if(one >= min){
                long diff = one - min + 1;
                ans += (diff * (diff + 1)) / 2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
