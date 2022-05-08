
/*합이 같은 부분집합 */
import java.util.*;

public class SumSubsequence {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void dfs(int l, int sum, int[] arr) {
        if (flag)
            return;
        if(sum>total/2) return;
        if (l == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }

        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }

    }

    public static void main(String[] args) {

        SumSubsequence s = new SumSubsequence();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        s.dfs(0, 0, arr);
        System.out.print(answer);
    }

}
