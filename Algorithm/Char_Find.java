import java.util.*;
/// 문자 찾기
public class Char_Find {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		/*
		for(int i = 0;i<str.length();i++) {
			if (str.charAt(i) == t) {
				answer++;
			}
		}
		*/
		for(char c : str.toCharArray()) {
			if (c==t) answer++;
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Char_Find T = new Char_Find();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char t = kb.next().charAt(0);
		System.out.println(T.solution(str, t));
		
	}

}
