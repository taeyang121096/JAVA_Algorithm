
/*¹ÙµÏÀÌ ½ÂÂ÷*/
import java.util.*;

public class Dog {

    static int n = 0, ans = 0, c = 0;

    public void dfs(int l, int sum, int[] arr) {
        if (sum > c)
            return;
        if (l == n) {
            if (sum > ans) {
                ans = sum;
                return;
            }
        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        d.dfs(0, 0, arr);
        System.out.print(ans);
        
    }

}
