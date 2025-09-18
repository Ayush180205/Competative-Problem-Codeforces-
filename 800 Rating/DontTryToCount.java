import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            StringBuilder res = new StringBuilder(s1);
            boolean found = false;

            for(int i=1;i<= m+n;i++){
                if(res.toString().contains(s2)){
                    System.out.println(i);
                    found = true;
                    break;
                }
                res.append(s1);
            }
            if(!found)  System.out.println(-1);
        }
        sc.close();
    }
}
