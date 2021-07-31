/*»ğÀÔ Á¤·Ä*/

import java.util.*;

public class Insert {
    
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            for(int j = i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }

                    }
        return arr;

    }

    public static void main(String[]args){
        Insert i = new Insert();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int b = 0; b < n; b++)
            arr[b] = sc.nextInt();

        for (int c : i.solution(n, arr))
            System.out.print(c + " ");
    }
}
