package algorithmTest;
/*이분 검색*/
import java.util.*;
public class BinarySearch {

	public int solution(int n, int[]arr,int m) {
		int first = 0,last=arr.length - 1, half = 0;
		Arrays.sort(arr);
		while(first <= last) {
			half = (first + last) /2 ;
			
			
			if(arr[half] == m) return half + 1;
			else if(arr[half] > m) last = half-1;
			else if(arr[half] < m) first = half+1;
						
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch b = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
		
		System.out.print(b.solution(n, arr,m));
		

	}

}
