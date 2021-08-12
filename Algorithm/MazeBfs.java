package algorithmTest;
/*미로의 최단거리 통로 bfs*/

import java.util.*;
import java.io.*;

public class MazeBfs {
	
	static int [][] matrix = new int[9][9];
//	상 하 좌 우
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int [][] dis = new int[9][9];
	
	public void bfs(int x, int y) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		q.offer(y);
		matrix[x][y] = 1;
		
		while(!q.isEmpty()) {
			int qx = q.poll();
			int qy = q.poll();
						
			for(int i = 0;i<4;i++) {
				int tx = qx+dx[i];
				int ty = qy+dy[i];
				
				if(matrix[tx][ty] < 1) {
					matrix[tx][ty] = 1;
					q.offer(tx);
					q.offer(ty);
					dis[tx][ty] = dis[qx][qy]+1;
				}
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MazeBfs m = new MazeBfs();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int[] x : matrix) Arrays.fill(x, Integer.MAX_VALUE);	
		for(int i =1;i<8;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1;j<8;j++)
				matrix[i][j] = Integer.parseInt(st.nextToken());
		}
		
		m.bfs(1, 1);
		System.out.print(dis[7][7]);
		

	}

}
