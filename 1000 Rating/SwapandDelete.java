import java.util.*;

public class SwapandDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int zeros = 0, ones = 0;
            int count = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '1') ones++;
                else zeros++;
            }
            for(int i=0;i<str.length();i++){
                if(zeros > 0 && str.charAt(i) == '1'){
                    zeros--;
                    count++;
                }else if(ones > 0 && str.charAt(i) == '0'){
                    ones--;
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(str.length() - count);
        }
    }
}
