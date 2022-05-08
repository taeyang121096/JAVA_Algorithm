/*버블 정렬 */

import java.util.*;

public class Bubble {

    public int[] solution(int n, int[] arr) {
        for (int i = n; i > 0; i--) {
            for(int j = 1;j<i;j++){
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        Bubble b = new Bubble();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int c : b.solution(n, arr))
            System.out.print(c + " ");

    }

}