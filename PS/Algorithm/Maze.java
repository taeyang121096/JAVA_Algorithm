package algorithmTest;
/*╧л╥н е╫╩Ж*/

import java.util.*;
import java.io.*;



public class Maze {
	
	static int [][] check, matrix;
	static int[] start = {1,1},end= {7,7};
	//╩С го аб ©Л
	static int[] dx = {-1,1,0,0}, dy= {0,0,-1,1};
	
	static int ans = 0;
	
	public void solution(int x, int y) {
		if(x == end[0] && y == end[1]) {
			ans++;
			return;
		}else {
			for(int i =0;i<4;i++) {
				int tx = x + dx[i];
				int ty = y + dy[i];
				
				if(tx > 7 || ty >7||check[tx][ty] > 0|| matrix[tx][ty] >0) continue;
				else {
					check[tx][ty] = 1;
					solution(tx,ty);
					check[tx][ty] = 0;
				}
							
			}
			
		}
		return;
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Maze m = new Maze();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		matrix = new int[8][8];
		check = new int[8][8];
		check[1][1] = 1;
		for(int[] x : matrix) Arrays.fill(x, Integer.MAX_VALUE);
		
		
		for(int i = 1;i<8;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1;j<8;j++) matrix[i][j] = Integer.parseInt(st.nextToken());
		}
		m.solution(start[0], start[1]);
		System.out.print(ans);

	}

}
