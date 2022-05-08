package algorithmTest;
/*수열 추측하기*/
import java.util.*;

public class Seque {

	
	static int[] b, p ,ch;
	static int n, f;
	
	static int[][] dp = new int[11][11];
	static boolean flag = false;
	
	public int combi(int n, int r) {
		if(dp[n][r]>0) return dp[n][r];
		if(n == r || r==0) return 1;
		return dp[n][r]=combi(n-1,r-1)+combi(n-1,r);
		
	}
	
	public void dfs(int level,int sum) {
		if(flag) return;
		if(level == n) {
			if(sum == f) {
				for(int x : p) System.out.print(x+" ");
				flag = true;
			}
		}else {
			for(int i = 1;i<n+1;i++) {
				if(ch[i] ==0) {
					ch[i]=1;
					p[level] = i;
					dfs(level+1,sum+p[level]*b[level]);
					ch[i] = 0;
				}
			}
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seque s = new Seque();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f = sc.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1];
		for(int i = 0;i<n;i++) b[i] = s.combi(n-1, i);
		s.dfs(0, 0);
		
		

	}

}
