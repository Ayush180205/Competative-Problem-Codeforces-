import java.util.*;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            int peak = -1;
            for(int j=1;j<n-1;j++){
                if((arr[j] > arr[j-1]) && (arr[j] > arr[j+1])){
                    peak = j;
                    break;
                }
            }
            if(peak == -1) System.out.println("NO");
            else{
                System.out.println("YES");
                System.out.println((peak)+" "+(peak+1)+" "+(peak+2));
            }
        }
    }
}
