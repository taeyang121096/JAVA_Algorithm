package algorithmTest;

/*동전 교환*/
import java.util.*;
import java.io.*;
public class Coin {
	
	static int n,m,ans =Integer.MAX_VALUE;
		
	public void dfs(int l, int sum, int[]arr) {
		if(sum > m) return;
		if(sum == m ) {
			ans = Math.min(ans, l);
		}
		else {
			for(int i = 0;i<n;i++) {
				dfs(l+1,sum+arr[i],arr);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Coin c = new Coin();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[] coin = new int[n];
		for(int i = 0;i<n;i++) coin[i] = sc.nextInt();
		m = sc.nextInt();
		
		c.dfs(0, 0, coin);
		System.out.print(ans);
		
		

	}

}
