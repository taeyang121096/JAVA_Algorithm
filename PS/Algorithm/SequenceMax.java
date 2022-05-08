/*최대 길이 연속부분수열 */

import java.util.*;

public class SequenceMax {

    public int solution(int n, int k, int[] arr) {
        int ans = 0;
        int lt = 0, cnt = 0,index=0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                list.add(rt);
                cnt++;
                if(cnt > k){
                    cnt--;
                    if(ans < (rt-1)-lt+1) ans = (rt-1)-lt+1;
                    lt = list.get(index++) +1;
                }
            }

        }
        if(ans < (n-1)-lt+1) ans = (n-1)-lt+1;

        return ans;
    }

    public static void main(String[] args) {

        SequenceMax s = new SequenceMax();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print(s.solution(n, k, arr));
    }

}
