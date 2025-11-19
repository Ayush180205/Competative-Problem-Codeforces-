import java.util.*;

public class OlyaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long secondsum = 0;
            long secondmin = Long.MAX_VALUE;
            long firstmin = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                int m = sc.nextInt();
                long first = Long.MAX_VALUE;
                long second = Long.MAX_VALUE;
                for(int j=0;j<m;j++){
                    long curr = sc.nextLong();
                    if(curr < first){
                        second = first;
                        first = curr;
                    }else if(curr < second){
                        second = curr;
                    }
                }
                secondsum += second;
                secondmin = Math.min(second, secondmin);
                firstmin = Math.min(first,firstmin);
            }
            long ans = secondsum - secondmin + firstmin;
            System.out.println(ans);
        }
    }
}
