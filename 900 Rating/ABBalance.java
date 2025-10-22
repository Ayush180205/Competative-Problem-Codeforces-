import java.util.*;

public class ABBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int ab = 0 , ba = 0;
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b'){
                    ab++;
                }
                if(str.charAt(i) == 'b' && str.charAt(i+1) == 'a'){
                    ba++;
                }
            }
            if(str.length() == 1){
                System.out.println(str);
            }else if(ab == ba){
                System.out.println(str);
            }else{
                char[] arr = str.toCharArray();
                arr[str.length() - 1] = (ab > ba) ? 'a' : 'b';
                System.out.println(new String(arr));
            }  
        }
    }
}
