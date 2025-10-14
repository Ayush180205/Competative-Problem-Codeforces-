import java.util.*;

public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                arr[i] = curr;
                map.put(curr, map.getOrDefault(curr,0)+1);
            }
            int maxcount = Integer.MIN_VALUE;
            int num;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() > maxcount){
                    maxcount = entry.getValue();
                    num = entry.getKey();
                }
            }
            int remaining = n - maxcount;
            int operation = 0;
            while(maxcount < n){
                operation++;
                int add = Math.min(maxcount,remaining);
                operation += add;
                maxcount += add;
                remaining = n - maxcount;
            }
            System.out.println(operation);
        }
    }
}
