import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int eff = 0;
            for(int i=0;i<size-1;i++){
                eff += sc.nextInt();
            }
            System.out.println(-1 * eff);
        }
    }
}
