import java.util.*;

public class LukeisFoodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++) arr[i] = sc.nextLong();
            long[][] limit = new long[(int)n][2];
            
            for(int i=0;i<n;i++){
                limit[i][0] = arr[i] - x;
                limit[i][1] = arr[i] + x;
            }
            int ans = 0;
            long l = limit[0][0];
            long r = limit[0][1];

            for(int i=1;i<n;i++){
                l = Math.max(l, limit[i][0]);
                r = Math.min(r, limit[i][1]);

                if(l > r){
                    ans++;
                    l = limit[i][0];
                    r = limit[i][1];
                }
            }
            System.out.println(ans);
        }
    }
}


// Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-- > 0){
//             int n = sc.nextInt();
//             long x = sc.nextLong();
//             long[] arr = new long[(int)n];
//             for(int i=0;i<n;i++) arr[i] = sc.nextLong();
//             int ans = 0;
//             long left = Long.MIN_VALUE;
//             long right = Long.MAX_VALUE;
//             for(int i=0;i<n;i++){
//                 long L = arr[i] - x;
//                 long R = arr[i] + x;
//                 long newL = Math.max(L, left);
//                 long newR = Math.min(right, R);
//                 if(newL <= newR){
//                     left = newL;
//                     right = newR;
//                 }else{
//                     ans++;
//                     left = L;
//                     right = R;
//                 }
//             }
//             System.out.println(ans);
