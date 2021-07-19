/* 선택 정렬 */
import java.util.*;
public class SelectSort {

    public int[] solution(int n,int[]arr){
        for(int i =0;i<n;i++){
            int idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[idx]) idx=j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }
    public static void main(String[]args){
        SelectSort s = new SelectSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : s.solution(n,arr)){
            System.out.print(x+" ");
        }



    }
    
}
