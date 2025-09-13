import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int station = sc.nextInt();
            int reach = sc.nextInt();
            int[] arr = new int[station];
            for(int i=0;i<station;i++){
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for(int i=1;i<station;i++){
                max = Math.max(max,arr[i] - arr[i-1]);
            }
            max = Math.max(max, arr[0]);
            max = Math.max(max, (reach - arr[station-1]) * 2);
            System.out.println(max);
        }
    }
}
