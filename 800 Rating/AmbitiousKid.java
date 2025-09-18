import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<t;i++){
            min = Math.min(min, Math.abs(sc.nextInt()));
        }
        System.out.println(min);
    }
}
