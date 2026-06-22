import java.util.*;

public class EraseFirstorSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            Map<Character,Integer> map = new HashMap<>();
            int count = 0;
            int[] distinct = new int[n];
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch) == 1){
                    count++;
                }
                distinct[i] = count;
            }
            long ans = 0;
            for(int i=0;i<n;i++){
                ans += distinct[i];
            }
            System.out.println(ans);
        }
    }
}
