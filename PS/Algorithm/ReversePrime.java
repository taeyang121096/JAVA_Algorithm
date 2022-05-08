
// 뒤집은 소수
import java.util.*;

public class ReversePrime {

    public boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        else{
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;

        }
    }

    public void solution(int num, int[] ans) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = ans[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                tmp = tmp /10;
                res = res*10 + t;
            }
            if(isPrime(res)){
                list.add(res);
            }

        }

        for(int x : list){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        ReversePrime r = new ReversePrime();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            ans[i] = sc.nextInt();
        }

        r.solution(num, ans);

    }

}
