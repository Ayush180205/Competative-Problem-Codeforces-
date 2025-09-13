import java.util.*;

public class United {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int la = sc.nextInt();
            int[] a = new int[la];
            for(int i=0;i<la;i++){
                a[i] = sc.nextInt();
            }

            int min = Arrays.stream(a).min().getAsInt();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for(int i=0;i<la;i++){
                if(a[i] == min) b.add(a[i]);
                else c.add(a[i]);
            }

            if(c.size() == 0){
                System.out.println(-1);
                continue;
            }

            System.out.println(b.size() + " " + c.size());

            for(int i=0;i<b.size();i++){
                System.out.print(b.get(i)+" ");
            }
            System.out.println();
            for(int i=0;i<c.size();i++){
                System.out.print(c.get(i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
