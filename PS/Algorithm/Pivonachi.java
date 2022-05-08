package algorithmTest;
/*피보나치 수열*/
import java.util.*;
public class Pivonachi {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		while (list.size() < n) {
			list.add(list.get(list.size()-1)+list.get(list.size()-2));
			
		}
		for(int i:list) {
			System.out.print(i+" ");
		}
	}

}
