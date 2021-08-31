import java.util.*;
class Solution {

    int[] check(int brown, int yellow){
        int[] ans =new int[2];
        for(int i =1;i<=yellow;i++){
            int col=0,row=0;
            int rest = yellow - i;
            if(rest%i !=0)
                continue;

            col = i+2;
            row = rest/i + 1;
            if(brown == (col*2+row*2)){
                ans[0] = row+2;
                ans[1] = col;
                return ans;
            }

        }
        return ans;
    }
    public int[] solution(int brown, int yellow) {


        return check(brown,yellow);
    }
}