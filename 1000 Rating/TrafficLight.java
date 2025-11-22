import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char color = sc.next().charAt(0);
            String str = sc.next();
            str += str;
            int len = str.length();
            long lastgreen = -1;
            long maxsec = Integer.MIN_VALUE;
            for(int i=len-1;i>=0;i--){
                if(str.charAt(i) == 'g') lastgreen = i;
                if(str.charAt(i) == color){
                    if (lastgreen != -1) {
                        long diff = lastgreen - i;
                        maxsec = Math.max(maxsec, diff);
                    }
                }
            }
            System.out.println(maxsec);
        }
    }
}
