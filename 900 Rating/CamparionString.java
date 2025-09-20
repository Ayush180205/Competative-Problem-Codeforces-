import java.util.*;

public class CamparionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            
            int maxLen = 1, curr = 1;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == str.charAt(Math.max(0, i))) { 
                    // Reset properly
                }
                if (str.charAt(i) == '<') {
                    curr++;
                } else {
                    curr = 1; 
                }
                maxLen = Math.max(maxLen, curr);
            }

            curr = 1;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '>') {
                    curr++;
                } else {
                    curr = 1;
                }
                maxLen = Math.max(maxLen, curr);
            }

            System.out.println(maxLen);
        }
    }
}
