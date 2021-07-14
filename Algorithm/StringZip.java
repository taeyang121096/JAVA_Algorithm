package algorithmTest;

import java.util.*;

public class StringZip {

	public String solution(String str) {
		String ans = "";
		char temp = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (temp == str.charAt(i))
				count++;
			else {
				if (count == 1)
					ans += temp;
				else {
					ans +=temp;
					ans += Integer.toString(count);
				}
				temp = str.charAt(i);
				count = 1;
			}
		}
		if (count == 1)
			ans += temp;
		else {
			ans +=temp;
			ans += Integer.toString(count);
		}

		return ans;
	}

	public static void main(String args[]) {
		StringZip zip = new StringZip();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();

		System.out.println(zip.solution(s));
		kb.close();

	}

}
