package algorithmTest;
import java.util.*;
import java.io.*;
public class AreaNum {
	static int[][] mat;
//	»óÇÏÁÂ¿ì
	static int[][] dis = {{-1,0},
			{1,0},
			{0,-1},
			{0,1}};
	static boolean[][] check;
	static int count;
	static List<Integer> list = new ArrayList<>();
	int dfs(int row , int col) {
		mat[row][col] = 0;
		check[row][col] = true;
		
		for(int i = 0;i<4;i++) {
			int nr = row+dis[i][0];
			int nc = col+dis[i][1];
			if(nr >=0&&nr<mat.length&&nc>=0&&nc<mat.length&&mat[nr][nc]==1&&check[nr][nc] == false) {
				count++;
				dfs(nr,nc);
				
			}
		}
			
		return count;
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AreaNum a = new AreaNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		mat = new int[n][n];
		check = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			String input = sc.next();
			for(int j = 0;j<n;j++)
				mat[i][j] = Character.getNumericValue(input.charAt(j));
		}
		for(int i = 0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(mat[i][j] == 0)
					continue;
				count = 1;
				list.add(a.dfs(i,j));
				
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int i : list)
			System.out.println(i);
		
		

	}

}
