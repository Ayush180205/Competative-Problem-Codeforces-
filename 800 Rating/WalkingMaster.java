import java.util.*;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int xi = sc.nextInt();
            int yi = sc.nextInt();
            int xf = sc.nextInt();
            int yf = sc.nextInt();
            if (yf < yi || xi + (yf - yi) < xf) {
                System.out.println(-1);
            } else {
                long steps = 2 * (yf - yi) + (xi - xf);
                System.out.println(steps);
            }
        }
    }
}
