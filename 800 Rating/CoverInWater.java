import java.util.*;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int length = sc.nextInt();
            String str = sc.next();
            if(str.contains("...")) System.out.println(2);
            else{
                int dots = 0;
                for(int i=0;i<length;i++){
                    if(str.charAt(i) == '.') dots++;
                }
                System.out.println(dots);
            }
        }
    }
}
