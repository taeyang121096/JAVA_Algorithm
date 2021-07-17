/* 점수 계산*/

import java.util.*;
public class Score {

    public void solution(int n, int[]ans){
        int pre = 0,answer = 0;
        for(int i=0;i<n;i++){
            if (ans[i] == 1){
                pre ++;
                answer += pre;
            }
            else{
                pre = 0;
            }
            
        }
        System.out.print(answer);



    }


    public static void main(String[]args){
        Score s = new Score();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];

        for(int i =0;i<n;i++){
            ans[i] = sc.nextInt();
        }
        s.solution(n, ans);

    }
    
}
