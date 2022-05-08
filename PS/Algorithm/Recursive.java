
/*Àç±ÍÇÔ¼ö*/
import java.util.*;

public class Recursive {

    public void dfs(int n) {
        if(n==0) return;
        else{
            
            dfs(n-1);
            System.out.print(n+" ");
        }

    }

    public static void main(String[] args) {
        Recursive r = new Recursive();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        r.dfs(n);
    }

}
