import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int maxzero = 0;
            int currzero = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 0) currzero++;
                else{
                    maxzero = Math.max(maxzero,currzero);
                    currzero = 0;
                }
            }
            maxzero = Math.max(maxzero,currzero);
            System.out.println(maxzero);
        }
    }
}
