package algorithmTest;
/*토마토 bfs 활용*/

import java.util.*;
import java.io.*;
class Index{
//	행 열
	int x,y;
	
	public Index(int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	
}
public class Tomato {
	static int[][] con;
	static int[][] dis;
//	상하좌우
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public void bfs(Queue<Index>q, int n, int m) {
		while(!q.isEmpty()) {
			Index i = q.poll();
			int x = i.x;
			int y = i.y;
			for(int j = 0;j<4;j++) {
				int tx = x+dx[j];
				int ty = y+dy[j];
				if(0 <= tx && tx < n && 0 <= ty && ty <m && con[tx][ty] == 0) {
					con[tx][ty] = 1;
					dis[tx][ty] = dis[x][y]+1;
					q.offer(new Index(tx,ty));
				}
			}
			
			
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Tomato t = new Tomato();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int ans = Integer.MIN_VALUE;
		boolean check = false;
		con = new int[n][m];
		dis = new int[n][m];
		Queue<Index> q = new LinkedList<>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<m;j++) {
				int val = Integer.parseInt(st.nextToken());
				if(val == 1) q.offer(new Index(i,j));
				con[i][j] = val;
			}
				
		}
		
		t.bfs(q, n, m);
		
		for(int[] a : dis) {
			if(ans < Arrays.stream(a).max().getAsInt()) ans = Arrays.stream(a).max().getAsInt();
		}
		for(int[] b : con) if(Arrays.stream(b).anyMatch(x->x==0)) check = true;
		if(check) {
			System.out.print(-1);
		}else {
		System.out.print(ans);
		}
	}

}
