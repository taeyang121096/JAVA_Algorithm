
/* ºÀ¿ì¸® */
import java.util.*;

public class Peaks {
/*
    public boolean checkDirection(int i, int j, int[][] matrix) {
        boolean flag = true;
        if (matrix[i][j] > matrix[i - 1][j]) {
            matrix[i - 1][j] = 0;
        } else
            flag = false;
        if (matrix[i][j] > matrix[i + 1][j]) {
            matrix[i - 1][j] = 0;
        } else
            flag = false;
        if (matrix[i][j] > matrix[i][j - 1]) {
            matrix[i - 1][j] = 0;
        } else
            flag = false;
        if (matrix[i][j] > matrix[i][j + 1]) {
            matrix[i - 1][j] = 0;
        } else
            flag = false;

        return flag;
    }
*/
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, 1, 0, -1 };

    public int solution(int n, int[][] matrix) {
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (matrix[nx][ny] >= matrix[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Peaks p = new Peaks();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print(p.solution(n, matrix));
    }

}
