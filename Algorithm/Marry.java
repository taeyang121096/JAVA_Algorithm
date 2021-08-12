 package algorithmTest;
import java.util.*;

class Time{
	int start, end;
	
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
}
 
 
public class Marry {
	static int[] count;
	static Time[] time;
	
	public void solution() {
		count = new int[time[time.length-1].end];
		
		for(Time t : time) {
			for(int i =t.start;i<t.end;i++) count[i] += 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marry m = new Marry();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		time = new Time[n];
		
		for(int i =0;i<n;i++) time[i] = new Time(sc.nextInt(),sc.nextInt());
		
		Arrays.sort(time,new Comparator<Time>(){
			@Override
			public int compare(Time t1, Time t2) {
				return t1.end - t2.end;
			}
		});
		m.solution();
		System.out.print(Arrays.stream(count).max().getAsInt());

	}

}
