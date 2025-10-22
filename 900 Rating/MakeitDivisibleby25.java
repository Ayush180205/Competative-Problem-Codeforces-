import java.util.*;

public class MakeitDivisibleby25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            String str = sc.next();
            List<String> possibleValues = Arrays.asList("00","25","50","75");
            int ans = Integer.MAX_VALUE;
            for (String possibleValue : possibleValues) {
				ans = Math.min(ans, minOperations(str, possibleValue)); // Find the minimum operations
			}
            System.out.println(ans);
        }
        sc.close();
    }
    static int minOperations(String str, String possibleValue){
        int ops = 0;
        int checkerIndex = possibleValue.length() - 1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == possibleValue.charAt(checkerIndex)){
                checkerIndex--;
                if(checkerIndex < 0){
                    break;
                }
            }else{
                ops++;
            }
        }
        if(checkerIndex >= 0){
            ops = Integer.MAX_VALUE;
        }
        return ops;
    }
}
