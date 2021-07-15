package algorithmTest;
/* 암호 문제*/
import java.util.*;

public class Incode {

	public String solution(int num, String str) {
		String ans = "";
		for (int i = 0; i < num; i++) {
			String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int number = Integer.parseInt(temp, 2);
			ans += (char)number;
			str = str.substring(7);
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Incode i = new Incode();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();

		System.out.println(i.solution(num, str));

	}

}
