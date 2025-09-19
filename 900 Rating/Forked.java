import java.util.*;
import java.awt.Point;

public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();

            Set<Point> kingpoint = new HashSet<>();
            Set<Point> queenpoint = new HashSet<>();

            int[] dx = {a,a,-a,-a,b,b,-b,-b};
            int[] dy = {b,-b,b,-b,a,-a,a,-a};

            for(int i=0;i<8;i++){
                kingpoint.add(new Point(xk+dx[i],yk+dy[i]));
                queenpoint.add(new Point(xq+dx[i],yq+dy[i]));
            }

            int count = 0;
            for (Point p : kingpoint) {
                if (queenpoint.contains(p)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
