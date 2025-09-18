import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sure = a+b+c;
            if(sure >= 2) res++;
        }
        System.out.println(res);
    }
}
