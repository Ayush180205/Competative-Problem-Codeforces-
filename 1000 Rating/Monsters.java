import java.util.*;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            StringBuilder str = new StringBuilder();
            long[] rem = new long[(int)n];
            long[] idx = new long[(int)n];
            for(int i=0;i<n;i++){
                long a = sc.nextLong();
                long r = a % k;
                if(r == 0) r = k;
                rem[i] = r;
                idx[i] = i+1;
            }
            Integer[] order = new Integer[n];
            for(int i=0;i<n;i++) order[i] = i;

            Arrays.sort(order,(i,j)->{
                if(rem[i] != rem[j]) return Long.compare(rem[j], rem[i]);
                return Integer.compare((int)idx[i],(int)idx[j]);
            });
            for(int i=0;i<n;i++){
                str.append(idx[order[i]]).append(" ");
            }
            System.out.println(str.toString());
        }
    }
}
