import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            String str = sc.next();
            StringBuilder res=  new StringBuilder();
            if(str.length() > 10){
                res.append(str.charAt(0));
                res.append(str.length() - 2);
                res.append(str.charAt(str.length()-1));
            }else{
                res.append(str);
            }
            System.out.println(res.toString());
        }
    }
}
