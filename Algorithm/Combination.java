package algorithmTest;
/*조합의 경우의수*/

import java.util.*;

public class Combination {

	static int[][] mem = new int[34][34];
	public int dfs(int n, int r) {
		
		if(mem[n][r]>0) return mem[n][r];
		if(r==0||r==n) return mem[n][r] = 1;
		return mem[n][r]=dfs(n-1,r-1)+dfs(n-1,r); 		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Combination c = new Combination();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.print(c.dfs(n,r));

	}

}
