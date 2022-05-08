/*공주 구하기*/

import java.util.*;
public class Prince {


    public int solution(int n, int k){
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) queue.add(i+1);

        while(queue.size()>1){
            for(int i = 1;i<k;i++){
                int tmp = 0;
                tmp = queue.poll();
                queue.add(tmp);
            }
            queue.poll();
        }

        return queue.poll();


    }

    public static void main(String[]args){

        Prince p = new Prince();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.print(p.solution(n,k));

    }
    
}
