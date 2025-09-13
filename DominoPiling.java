import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if((m*n) % 2 == 0) System.out.println(m*n / 2);
        else System.out.println(((m*n)-1)/2);
    }
}
