/*공통 원소 구하기 */

import java.util.*;
// 투포인터 할때는 오름 차순 정렬 해야 된다는것을 기억해야 한다!!
public class SameEle {

    public ArrayList<Integer> solution(int n, int m,int[]arr1,int[]arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<n && p2<m){
            if(arr1[p1] == arr2[p2]){
                list.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1] > arr2[p2]) p2++;
            else if(arr1[p1] < arr2[p2]) p1++;
        }



        return list;
    }
    public static void main(String[] args) {
        SameEle s = new SameEle();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        for(int x: s.solution(n,m,arr1,arr2) ) System.out.print(x + " ");

    }

}
