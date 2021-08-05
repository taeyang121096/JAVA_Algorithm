package algorithmTest;
/*마구간 정하기*/
import java.util.*;

public class Stall {
	
	public int solution(int n, int m, int[] arr) {
		int ans = 0;
		Arrays.sort(arr);
		int lt = 1,rt = arr[arr.length-1];
		int mid = 0;
		
		while(lt<=rt) {
			int cnt = 0,tmp=0;
			mid = (lt+rt)/2;
			for(int x : arr) {
				if(x >= tmp) {
					tmp = x+mid;
					cnt++;
				}
			}
			if(cnt >= 3) {
				ans = mid;
				lt = mid +1;
			}
			else rt = mid -1;
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Stall s = new Stall();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int c = sc.nextInt();
		 int[] arr = new int[n];
		 for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
		 
		 System.out.print(s.solution(n, c, arr));

	}

}
