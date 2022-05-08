/*재귀함수를 이용한 이진수 출력 */
import java.util.*;

public class Binary {

    public void dfs(int n){
        if(n==0) return;
        else{
            dfs(n/2);
            System.out.print(n%2);
        }

    }
    public static void main(String[]args){
        Binary b = new Binary();
        b.dfs(11);

        
    }
    
}
