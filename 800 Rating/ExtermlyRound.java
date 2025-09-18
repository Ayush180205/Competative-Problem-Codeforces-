import java.util.Scanner;

public class ExtermlyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = String.valueOf(n);
            int len = s.length();
            int power = (int)Math.pow(10, len-1);
            int result = (len - 1) * 9 + (n / power);
            System.out.println(result);
        }
    }
}
