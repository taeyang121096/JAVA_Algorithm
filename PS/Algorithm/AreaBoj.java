package algorithmTest;
import java.util.*;
import java.io.*;
public class AreaBoj {

	
	static int[][] mat;
	static int m,n;
//	상하좌우 행열
	static int[][] dis ={{-1,0},{1,0},{0,-1},{0,1}};
	static List<Integer> list = new ArrayList<>();
	static boolean flag = false;
	void dfs(int r, int c,int count) {
		if(flag)
			return;
		mat[r][c] += 1;
		for(int i = 0;i<4;i++) {
			int nr = r+dis[i][0];
			int nc = c+dis[i][1];
			if(nr >=0&&nr<m&&nc>=0&&nc<n&&mat[nr][nc]<1)
				dfs(nr,nc,count+1);
		}
		if(!flag) {
			flag = true;
			list.add(count);
		}
		return;
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AreaBoj a = new AreaBoj();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		mat = new int[m][n];
		
		for(int i = 0;i<k;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 =Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int r = m - y1-1;r>=5-y2;r--) {
				for(int c = x1;c<x2;c++) {
					mat[r][c] += 1;
				}
			}
		}
		
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(mat[i][j]>0)
					continue;
				a.dfs(i,j,1);
				flag = false;
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i : list)
			System.out.print(i+" ");
		
		

	}

}
