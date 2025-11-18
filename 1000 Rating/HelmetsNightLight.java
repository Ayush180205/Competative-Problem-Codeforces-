import java .util.*;

public class HelmetsNightLight {
    static class Pair{
        long cost;
        long shares;
        Pair(long cost, long shares){
            this.cost = cost;
            this.shares = shares;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long p = sc.nextLong();
            long[] a = new long[(int)n];
            long[] b = new long[(int)n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            for(int i=0;i<n;i++) b[i] = sc.nextInt();
            List<Pair> v = new ArrayList<>();
            for(int i=0;i<n;i++){
                v.add(new Pair(b[i],a[i]));
            }
            Collections.sort(v, Comparator.comparingLong(Pair->Pair.cost));

            long mincost = p;
            long alreadyshared = 1;

            for(Pair pair : v){
                long thiscost = pair.cost;
                long thisshare = pair.shares;

                if(thiscost >= p) break;

                if(alreadyshared + thisshare > n){
                    mincost += (n - alreadyshared) * thiscost;
                    alreadyshared = n;
                    break;
                }else{
                    mincost += thiscost * thisshare;
                    alreadyshared += thisshare;
                }
            }
            mincost += (n - alreadyshared) * p;
            System.out.println(mincost);
        }
    }
    
}
