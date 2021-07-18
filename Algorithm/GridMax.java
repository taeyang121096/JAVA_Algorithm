
/* 격자판 최대 합 */
import java.util.*;

public class GridMax {

    public int solution(int n, int[][] grid) {
        int ans = Integer.MIN_VALUE;
        int sum;
        int sum1, sum2;
/*
        // 행의 합
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
            if (sum > ans){
                ans = sum;
            }
        }

        // 열의 합
        for(int j = 0;j<n;j++){
            sum = 0;
            for (int i =0;i<n;i++){
                sum += grid[i][j];
            }
            if (sum>ans){
                ans = sum;
            }
        }
*/
        
        for(int i =0;i<n;i++){
            sum1=sum2=0;
            for(int j = 0;j<n;j++){
                sum1+=grid[i][j];
                sum2+=grid[j][i];
            }
            
        }
        ans = Math.max(ans,sum1);
        ans = Math.max(ans,sum2);

        // 대각선의 합
        sum1=sum2=0;
        for (int i = 0;i<n;i++){
            sum1 += grid[i][i];
            sum2 += grid[i][n-1-i];
        }
        ans = Math.max(ans, sum1);
        ans = Math.max(ans, sum2);
        return ans;
    }

    public static void main(String[] args) {

        GridMax g = new GridMax();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print(g.solution(n, grid));

    }
}
