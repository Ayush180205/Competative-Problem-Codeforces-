import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] matrix = new char[10][10];
            for (int i = 0; i < 10; i++) {
                matrix[i] = sc.next().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (matrix[i][j] == 'X') {
                        int score = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j)) + 1;
                        count += score;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
