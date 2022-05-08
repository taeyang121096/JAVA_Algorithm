package algorithmTest;
/*Lis dynamic*/

import java.util.*;
public class LisDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		dp[0] = 1;
		
		for(int i = 1;i<n;i++) {
			int max = 0;
			for(int j = i-1;j>=0;j--) {
				if(arr[j] < arr[i] && dp[j] > max) max = dp[j];
			}
			dp[i] = max+1;
		}
		
		System.out.print(Arrays.stream(dp).max().getAsInt());
	}

}
