/* 크레인 인형 뽑기 */

import java.util.*;

public class Crane {

    public int solution(int[][] board, int[] moves) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for( int index : moves){
            for(int i =0;i<board.length;i++){
                if(board[i][index-1]!=0){
                    int tmp = board[i][index-1];
                    board[i][index-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        ans += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Crane c = new Crane();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++)
            moves[i] = sc.nextInt();

        System.out.print(c.solution( board, moves));

    }

}
