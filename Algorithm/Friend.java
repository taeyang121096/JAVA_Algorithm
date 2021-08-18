package algorithmTest;

import java.util.*;
import java.io.*;
public class Friend {
	static int[] check;
	static boolean flag = false;
	static Map<Integer, ArrayList<Integer>> map;
	public void dfs(int start, int end) {
		
		if(flag == true) 
			return;
		if(start == end) {
			flag = true;
			return;
		}
		if(!map.containsKey(start))
			return;
		for(int key : map.get(start))
				dfs(key,end);	
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Friend f = new Friend();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		check = new int[n];
		
		for(int i = 0; i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int key = Integer.parseInt(st.nextToken()); 
			int val = Integer.parseInt(st.nextToken());
			if(!map.containsKey(key))
				map.put(key, new ArrayList<Integer>(Arrays.asList(val)));
			else {
				ArrayList<Integer> temp = map.get(key);
				temp.add(val);
				map.put(key,temp);
			}
		}
		st = new StringTokenizer(br.readLine()," ");
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());;
		f.dfs(start, end);
		if(flag)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}
