import java.util.*;

public class WeNeedZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int totalXor = 0;
            for(int i=0;i<n;i++)    totalXor^=sc.nextInt();
            if(n%2 == 1)    System.out.println(totalXor);
            else{
                if(totalXor == 0){
                    System.out.println(totalXor);
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
