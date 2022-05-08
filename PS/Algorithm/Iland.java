package algorithmTest;

/*섬나라 아일랜드*/
import java.util.*;
import java.io.*;

public class Iland {
//	상 하 좌 우 왼대위 왼대하 오대위 오대하 x = 행 y = 열 
	static int[] dx = {-1,1,0,0,-1,1,-1,1};
	static int[] dy = {0,0,-1,1,-1,-1,1,1};
	static int[][]m;
	static int ans =0;
	public void dfs(int x, int y) {
		if(m[x][y] == 0) return;
		m[x][y] = 0;
		int tx=0,ty=0;
		for(int i =0;i<8;i++) {
			tx = x+dx[i];
			ty = y+dy[i];
			if(tx >=0 && tx <m.length && ty >=0 && ty <m.length && m[tx][ty] == 1) dfs(tx,ty);
		}
		return;
		
	}
	
	
	public void solution(int n) {
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++) {
				if(m[i][j] == 0) continue;
				dfs(i,j);
				ans++;
			}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Iland il = new Iland();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		m = new int[n][n];
		for(int i =0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<n;j++) m[i][j] = Integer.parseInt(st.nextToken());
		}
		il.solution(n);
		System.out.print(ans);

	}

}
