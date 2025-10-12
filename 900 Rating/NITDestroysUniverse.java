import java.util.*;

public class NITDestroysUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            int firstNonZero = -1;
            int lastNonZero = -1;
            boolean allZero = true;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] != 0) {
                    allZero = false;
                    if (firstNonZero == -1) firstNonZero = i;
                    lastNonZero = i;
                }
            }
            
            if (allZero) {
                System.out.println(0);
                continue;
            }
            
            boolean hasZeroInMiddle = false;
            for (int i = firstNonZero; i <= lastNonZero; i++) {
                if (arr[i] == 0) {
                    hasZeroInMiddle = true;
                    break;
                }
            }
            
            if (hasZeroInMiddle) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}
