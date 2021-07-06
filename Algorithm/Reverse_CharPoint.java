import java.util.*;
/// 특정 문자 뒤집기
public class Reverse_CharPoint {
	
	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		int lt = 0, rt = str.length() - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
	
		}
		
		answer = String.valueOf(c);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_CharPoint t = new Reverse_CharPoint();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.print(t.solution(str));
		
		

	}

}
