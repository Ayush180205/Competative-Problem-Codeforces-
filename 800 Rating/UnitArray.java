import java.util.*;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int sum = 0;
            int ope = 0;
            int neg = 0;
            for(int i=0;i<size;i++){
                int curr = sc.nextInt();
                sum += curr;
                if(curr == -1){
                    neg++;
                }
            }
            int flipsForSum = 0;
            if (sum < 0) {
                flipsForSum = (-sum + 1) / 2;  // integer ceiling
            }
            int remaning = neg - flipsForSum;
            if(remaning % 2 != 0)   System.out.println(flipsForSum + 1);
            else System.out.println(flipsForSum);
        }
    }
}
