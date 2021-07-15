package algorithmTest;

/* 보이는 학생 */
import java.util.*;

public class Student {

	public ArrayList<Integer> solution(int n , int[] student) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(student[0]);
		for(int i = 1;i<n;i++) {
			if (list.get(list.size()-1) < student[i]) {
				list.add(student[i]);
			}
		}

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] student = new int[n];
		for (int i = 0; i < n; i++) {
			student[i] = sc.nextInt();
		}
		
		ArrayList<Integer> ans = s.solution(n,student);
		System.out.println(ans.size());

	}

}
