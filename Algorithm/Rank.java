/* 등수구하기 */

import java.util.*;

public class Rank {

    public ArrayList<Integer> solution(int n, ArrayList<Integer> score) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(score,Collections.reverseOrder());
        int rank = 1, count = 1;
        ans.add(rank);
        for (int i = 1; i < n; i++) {
            if (score.get(i-1) == score.get(i)) {
                count++;
                ans.add(rank);
            } else {
                rank += count;
                count = 1;
                ans.add(rank);
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Rank r = new Rank();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> score = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            score.add(sc.nextInt());
        }
        for (int x : r.solution(n, score)) {
            System.out.print(x + " ");
        }

    }

}
