package algorithmTest;
/*최대 점수 구하기*/

import java.util.*;
import java.io.*;
public class Olympia {
	
	static int n;
	static int m;
	static int[]score;
	static int[]time;
	static int max =0;
	public void dfs(int level,int sum, int tsum) {
		if (level == n) {
			if(tsum <= m && sum> max) max = sum;
			return;
		}
		else {
			dfs(level+1,sum+score[level],tsum+time[level]);
			dfs(level+1,sum,tsum);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Olympia o = new Olympia();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		score = new int[n];
		time = new int[n];
		for(int i = 0;i<n;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			score[i] = Integer.parseInt(st1.nextToken());
			time[i] = Integer.parseInt(st1.nextToken());	
		}
		o.dfs(0,0,0);
		System.out.print(max);
		
		

	}

}
