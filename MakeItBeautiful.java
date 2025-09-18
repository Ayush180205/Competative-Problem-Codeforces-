import java.util.*;

public class MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int maxindex = 0, minindex = 0;

            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                arr[i] = curr;
                if(curr < min){
                    min = curr;
                    minindex = i;
                }
                if(curr > max){
                    max = curr;
                    maxindex = i;
                }
            }

            if(min == max){
                System.out.println("No");
                continue;
            }

            int temp = arr[0];
            arr[0] = arr[maxindex];
            arr[maxindex] = temp;
            int temp2 = arr[1];
            arr[1] = arr[minindex];
            arr[minindex] = temp2;

            System.out.println("Yes");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
