import java.util.*;

public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++) arr[i] = sc.nextLong();

            Map<Long,Long> freq = new HashMap<>();
            for(int i=0;i<n;i++){
                freq.put(arr[i],freq.getOrDefault(arr[i],0L)+1);
            }
            boolean isok = false;
            for(long count : freq.values()){
                if(count == 1){
                    isok = true;
                    break;
                }
            }
            if(isok){
                System.out.println(-1);
                continue;
            }
            List<Long> student = new ArrayList<>();
            for(long i=1;i<=n;i++) student.add(i);
            
            int l = 0, r = 0;
            while(r < n){
                if(arr[l] == arr[r]) r++;
                else{
                    Collections.rotate(student.subList(l, r),-1);
                    l = r;
                }
            }
            Collections.rotate(student.subList(l, r), -1);
            for(long std : student){
                System.out.print(std+" ");
            }
            System.out.println();
        }
    }
}
