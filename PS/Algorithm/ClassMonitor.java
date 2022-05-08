/* 임시반장 정하기 */
import java.util.*;

public class ClassMonitor {

    public int solution(int n, int[][]classnum){
        int index = 0;
        int ans = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                for(int k =0;k<5;k++){
                    if(classnum[i][k] == classnum[j][k]){
                        count ++;
                        break;
                    }
                }
            }
            if (ans < count){
                ans = count;
                index = i+1;
            }
        }

        return index;
    }
    
    public static void main(String[]args){
        ClassMonitor c = new ClassMonitor();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] classnum = new int[n][5];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<5;j++){
                classnum[i][j] = sc.nextInt();
            }
        }
        System.out.print(c.solution(n,classnum));



    }
}
