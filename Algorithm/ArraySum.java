
/* 두 배열 합치기  */
import java.util.*;

public class ArraySum {

    public void solution(int n, int m, int[] arr1, int[] arr2) {
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                System.out.print(arr1[p1] + " ");
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                System.out.print(arr2[p2] + " ");
                p2++;
            } else {
                System.out.print(arr1[p1] + " ");
                System.out.print(arr2[p2] + " ");
                p1++;
                p2++;
            }
        }
        if (p1 < n) {
            while (p1 < n) {
                System.out.print(arr1[p1] + " ");
                p1++;
            }
        } else {
            while (p2 < m) {
                System.out.print(arr2[p2] + " ");
                p2++;
            }
        }

    }

    public static void main(String[] args) {
        ArraySum a = new ArraySum();
        Scanner sc = new Scanner(System.in);
        int n, m;
        int[] arr1, arr2;
        n = sc.nextInt();
        arr1 = new int[n];

        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        m = sc.nextInt();
        arr2 = new int[m]; 
        for (int j = 0; j < m; j++)
            arr2[j] = sc.nextInt();
        

        a.solution(n, m, arr1, arr2);

    }

}
