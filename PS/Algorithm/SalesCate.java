/*매출액의 종류 */

import java.util.*;

public class SalesCate {

    public void solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(map.size()+" ");
        int key = 0;
        for (int j = k; j < n; j++) {
            if (map.get(arr[key]) > 1) {
                map.put(arr[key], map.get(arr[key]) - 1);
            } else {
                map.remove(arr[key]);
            }
            key++;
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            System.out.print(map.size()+" ");
        }
    }

    public static void main(String[] args) {
        SalesCate s = new SalesCate();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        s.solution(n, k, arr);

    }

}
