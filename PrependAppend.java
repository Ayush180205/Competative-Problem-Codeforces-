import java.util.*;

public class PrependAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            int i=0, j=n-1;
            while(i < j){
                if(str.charAt(i) != str.charAt(j)){
                    n-=2;
                    i++;
                    j--;
                }else{
                    break;
                }
            }
            System.out.println(n);
        }
    }
}
