
/* ∏‡≈‰∏µ */
import java.util.*;

public class Mentoring {
   

    public int solution(int n, int m, int[][] arr) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                int pi=0,pj=0;
                for (int r = 0; r < m; r++) {
                    for (int c = 0; c < n; c++) {
                        if(arr[r][c] == i){
                            pi = c;
                        }
                        if(arr[r][c] == j){
                            pj = c;
                        }
                    }
                    if(pi < pj){
                        cnt ++;
                    }
                }
                if (cnt == m){
                    ans ++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Mentoring mt = new Mentoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(mt.solution(n, m, arr));

    }
}
