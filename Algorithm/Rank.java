/* 등수구하기 */

import java.util.*;

public class Rank {

    public int [] solution(int n, int[] score) {
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (score[j] > score[i]){
                    rank ++;
                }

            }
            ans[i] = rank;
        }

        return ans;
    }

    public static void main(String[] args) {
        Rank r = new Rank();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        for (int x : r.solution(n, score)) {
            System.out.print(x + " ");
        }

    }

}
