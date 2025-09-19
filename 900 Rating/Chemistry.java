import java.util.*;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] freq = new int[26];

            for(char ch : str.toCharArray()){
                freq[ch-'a']++;
            }

            int count = 0;
            for(int i=0;i<26;i++){
                if(freq[i] % 2 != 0) count++;
            }

            if(count <= k + 1) System.out.println("yes");
            else System.out.println("No");
        }
    }
}
