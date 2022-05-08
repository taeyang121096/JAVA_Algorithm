package algorithmTest;
/* 계단 오르기*/

import java.util.*;

public class Stair {

	static ArrayList<Integer> dp = new ArrayList<Integer>(List.of(0,1,2));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stair s = new Stair();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i= 3;i<=n;i++) {
			dp.add(dp.get(i-2)+dp.get(i-1));
		}
		System.out.print(dp.get(dp.size()-1));

	}

}
