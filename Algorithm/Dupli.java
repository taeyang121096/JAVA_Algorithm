/*중복 확인*/

import java.util.*;

public class Dupli {


    public String solution(int n,int[] arr){
        String ans = "U";
        Arrays.sort(arr);
        for(int i = 0;i<n-1;i++){
            if(arr[i] == arr[i+1]) return "D";
        }

        return ans;
    }

    public static void main(String[]args){

        Dupli d = new Dupli();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(d.solution(n,arr));

    }
    
}
