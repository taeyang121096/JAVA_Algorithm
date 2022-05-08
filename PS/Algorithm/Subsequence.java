/* 연속 부분 수열 */

import java.util.*;

public class Subsequence {

    public int solution(int n, int m, int[] arr) {
        int ans = 0;
        int start = 0, end = 1;
        while(end<n+1){
            int sum =0;
            for(int i =start;i<end;i++){
                sum += arr[i];
            }
            if (sum==m){
                ans++;
                start++;
                end++;
            }
            else if(sum>m) start++;
            else end++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Subsequence s = new Subsequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(s.solution(n, m, arr));

    }

}
