import java.util.*;

public class OddGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long pos = sc.nextLong();
            long steps = sc.nextLong();
            long res = 1;
            if(pos % 2 == 0){
                long r = steps % 4;
                if(r == 0) res = pos;
                else if(r == 1) res = pos + steps;
                else if(r == 2) res = pos - 1;
                else res = pos - steps - 1;
            }else{
                long r = steps % 4;
                if(r == 0) res = pos;
                else if(r == 1) res = pos - steps;
                else if(r == 2) res = pos + 1;
                else res = pos + steps + 1;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
