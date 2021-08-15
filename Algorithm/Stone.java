package algorithmTest;
/* 돌 다리 건너기*/

import java.util.*;

public class Stone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stone s = new Stone();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dp = new int[n+1];
		dp[1] = 2;
		dp[2] = 3;
		
		for(int i = 3;i<n+1; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		System.out.print(dp[n]);
	}

}
