package algorithmTest;

import java.util.*;

public class ShortChar {

	public int[] solution(String str, char t) {
		int[] count = new int[str.length()];
		int cost = 1000;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t)
				cost = 0;
			count[i] = cost;
			cost++;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == t)
				cost = 0;
			if (count[i] > cost)
				count[i] = cost;
			cost++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortChar a = new ShortChar();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char t = kb.next().charAt(0);

		for (int x : a.solution(s, t)) {
			System.out.print(x + " ");
		}

	}

}