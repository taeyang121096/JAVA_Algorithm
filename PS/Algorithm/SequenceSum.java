/*연속된 자연수의 합*/

import java.util.*;

public class SequenceSum {
/* // 투포인터 방법
    public int solution(int n, int[] arr) {
        int ans = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; i < arr.length; rt++) {
            sum += arr[rt];
            if (sum == n)
                ans++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n)
                    ans++;
            }
        }

        return ans;

    }
*/
// 수학적 방법
    public int solution(int n){
        int ans=0;
        int cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n = n-cnt;
            if (n%cnt == 0) ans++;
        }

        return ans;
    }


    public static void main(String[] args) {

        SequenceSum s = new SequenceSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(s.solution(n));

    }

}
