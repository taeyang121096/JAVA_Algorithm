/// 유효한 팰린 드롬
import java.util.*;
public class Palindrome {
	
	public void solution(String str) {
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp)) System.out.print("YES");
		else System.out.print("NO");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome t = new Palindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		t.solution(str);

	}

}
