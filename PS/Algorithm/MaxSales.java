/* 최대 매출 */

import java.util.*;

public class MaxSales {

    public int solution(int n, int k, int[] sale) {
       int ans = 0, sum =0;
       for(int i=0;i<k;i++) sum+=sale[i];
       ans = sum;
       for(int i = k;i<n;i++){
           sum -= sale[i-k];
           sum += sale[i];
           if (sum > ans) ans = sum;
       }

       return ans;
    }

    public static void main(String[] args) {

        MaxSales m = new MaxSales();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sale = new int[n];
        for (int i = 0; i < n; i++) {
            sale[i] = sc.nextInt();
        }

        System.out.print(m.solution(n, k, sale));

    }

}
