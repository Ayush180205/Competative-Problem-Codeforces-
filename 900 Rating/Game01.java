import java.util.*;

public class Game01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int zeros = 0 , ones = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '0') zeros++;
                else ones++;
            }
            int ops = Math.min(zeros, ones);
            if(ops%2 != 0) System.out.println("DA");
            else System.out.println("NET");
        }
    }
}
