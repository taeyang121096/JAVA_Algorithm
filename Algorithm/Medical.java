/*¿¿±ﬁΩ« */

import java.util.*;
public class Medical {
    
    public int solution(int n, int m, int[] arr){
        int ans = 0;
        int max = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i = 0;i<n;i++) q1.offer(i);
        for(int c : arr) q2.offer(c);

        while(!q2.isEmpty()){
            max = Collections.max(q2);

            if(q2.peek()==max){
                ans++;
                if(q1.poll() == m) return ans;
                q2.poll();
            }
            else{
                q2.offer(q2.poll());
                q1.offer(q1.poll());
            }
        }
        return ans;

    }


    public static void main(String[]args){
        Medical me = new Medical();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(me.solution(n,m,arr));

    }
}
