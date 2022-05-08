package algorithmTest;
/*최대 수입 스케쥴*/
import java.util.*;
import java.io.*;

class Company implements Comparable<Company>{
	int m, d;
	
	public Company(int m, int d) {
		this.m = m ;
		this.d = d;		
	}
	
	@Override
	public int compareTo(Company c) {
		return c.d - this.d;
	}
	
	
}
public class Sche {
	
	public int solution(ArrayList<Company>list) {
		int sum = 0;
		int day = list.get(0).d;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(Company c: list) {
			if(day != c.d) {
				sum += q.poll();
				day = c.d;
			}
			q.offer(c.m);
		}
		
		return sum+q.poll();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Sche s = new Sche();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Company> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			list.add(new Company(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		Collections.sort(list);
		
		System.out.print(s.solution(list));
		

	}

}
