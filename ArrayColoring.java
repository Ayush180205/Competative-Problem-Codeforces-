import java.util.*;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int odd = 0;
            for(int i=0;i<size;i++){
                int curr = sc.nextInt();
                if(curr % 2 != 0) odd++;
            }
            if(odd % 2 == 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
