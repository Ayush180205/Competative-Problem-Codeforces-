import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int xpos = 0, ypos = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    xpos = i;
                    ypos = j;
                }
            }
        }
        System.out.println(Math.abs((xpos-2)) + Math.abs((ypos-2)));
    }
}
