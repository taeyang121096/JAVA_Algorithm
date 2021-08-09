package algorithmTest;
/* ¾¾¸§ ¼±¼ö*/

import java.util.*;

class Person implements Comparable<Person>{
	int height, weight;
	Person(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(Person o) {
		return o.height -this.height;
	}
	
	
}


public class Wrestling {
	
	public int solution(ArrayList<Person> l) {
		int ans = 0;
		int weight = 0;
		for(Person p : l) {
			if(p.weight > weight) {
				weight = p.weight;
				ans++;
			}
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wrestling w = new Wrestling();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Person> l = new ArrayList<>();
		for(int i = 0;i<n;i++) l.add(new Person(sc.nextInt(),sc.nextInt()));
		Collections.sort(l);
		for(Person p : l) {
			System.out.print(p.height+" "+p.weight);
			System.out.println();
		}
		System.out.print(w.solution(l));

	}

}
