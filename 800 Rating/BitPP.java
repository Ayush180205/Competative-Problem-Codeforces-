import java.util.*;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int plus = 0, minus = 0;
        while(n-- > 0){
            String str = sc.next();
            if(str.charAt(1) == '+') plus++;
            else minus++;
        }
        System.out.println(plus - minus);
    }
}
