import java.util.*;

public class RedVersusBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder str = new StringBuilder();
            int redlength = r / (b+1);
            int redrem = r % (b+1);
            for(int i=1;i<=b+1;i++){
                for(int j=0;j<redlength;j++){
                    str.append("R");
                }
                if(redrem > 0){
                    str.append("R");
                    redrem--;
                }
                if(i != b+1) str.append("B");
            }
            System.out.println(str.toString());
        }
    }
}
