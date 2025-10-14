import java.util.*;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            String s = sc.next();
            String t = sc.next();

            int i = s.length()-1;
            int j = t.length()-1;

            boolean possible = true;

            while(j >= 0){
                if(i < 0){
                    possible = false;
                    break;
                }

                if(s.charAt(i) == t.charAt(j)){
                    // Match found, move both pointers
                    i--;
                    j--;
                } else {
                    // Delete one letter from s, but also skip the next letter of same type
                    char skip = s.charAt(i);
                    i--; // delete current
                    if(i >= 0 && s.charAt(i) == skip) {
                        i--; // skip one extra if same letter consecutively
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
