import java.util.*;

public class PermutationSwap0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int onepos = -1 , twopos = -1, threepos = -1; 
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                if(curr == 1) onepos = i;
                if(curr == 2) twopos = i;
                if(curr == 3) threepos = i;
            }
            int diffone = onepos;
            int difftwo = twopos - 1;
            int diffthree = threepos - 2;
            
            

        }
    }
}
