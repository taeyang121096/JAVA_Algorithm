/// 회문 문자열
import java.util.*;

public class Same_Str {
	
	public String solution(String str) {
		/*
		int lt=0, rt = str.length()-1;
		boolean flag = true;
		char [] c = str.toCharArray();
		while(lt < rt) {
			if (c[lt] == c[rt]) {
				lt ++;
				rt --;
			}
			else {
				flag = false;
				break;
			}
		}
		if (flag == false) System.out.print("NO");
			
		else System.out.print("YES");
		*/
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			return answer;
		}
		else return "NO";
		
		
	}
	
	public static void main(String[]args) {
		Same_Str t = new Same_Str();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		str = str.toUpperCase();
		System.out.print(t.solution(str));
		
	}

}
