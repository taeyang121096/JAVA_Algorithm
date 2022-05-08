/*k 번째 큰수 */

import java.util.*;

public class Knumber {

    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : set){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;

    }

    public static void main(String[] args) {
        Knumber kn = new Knumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(kn.solution(arr, n, k));

    }

}
