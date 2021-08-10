package algorithmTest;
/*회의실 배정하기*/

import java.util.*;

class Time implements Comparable<Time>{
	int start,end;
	
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
		
	}
	@Override
	public int compareTo(Time t) {
		
		if(this.end == t.end) return this.start - t.start;
		
		return this.end - t.end;
		
	}
	
	
	
}


public class Room {
	
	public int solution(ArrayList<Time> list) {
		int ans = 0, end = Integer.MIN_VALUE;
		
		for(Time t : list) {
			if(end <= t.start) {
				end = t.end;
				ans++;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Time> list = new ArrayList<>();
		Room r = new Room();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) list.add(new Time(sc.nextInt(),sc.nextInt()));
		Collections.sort(list);
		System.out.print(r.solution(list));
		

	}

}
