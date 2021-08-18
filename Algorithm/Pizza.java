package algorithmTest;
/*피자 배달거리*/


import java.util.*; 
public class Pizza {
	
	static ArrayList<Loc> list1 = new ArrayList<>();
	static ArrayList<Loc> list2 = new ArrayList<>();
	static int[] cas;
	static int answer = Integer.MAX_VALUE;
	static class Loc{
		int r,c;
		Loc(int r, int c){
			this.r = r;
			this.c = c;
		}
	}
	
	public void calc() {
		int ans = 0;
		for(int i=0;i<list1.size();i++) {
			int res = Integer.MAX_VALUE;
			Loc l1 = list1.get(i);
			for(int j=0;j<cas.length;j++) {
				Loc l2 = list2.get(cas[j]);
				res = Math.min(res,Math.abs(l1.r - l2.r) + Math.abs(l1.c-l2.c));
			}
			ans += res;
		}
		answer = Math.min(answer,ans);
		
		
	}
	
	public void combi(int l, int s) {
		if(l == cas.length) {
			calc();
			return;
		}
		for(int i = s;i<list2.size();i++ ) {
			cas[l] = i;
			combi(l+1,s+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = new Pizza();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] city = new int[n][n];
		cas = new int[m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				city[i][j] = sc.nextInt();
				if(city[i][j] == 1) list1.add(new Loc(i+1,j+1));
				if(city[i][j]==2) list2.add(new Loc(i+1,j+1));
			}
		}
		p.combi(0,0);
		
		System.out.print(answer);
		

	}

}
