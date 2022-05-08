import java.util.*;
/// 대소문자 변환
public class Change_CharUpLow {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			/*
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
			*/
			// a = 97 ~ 122 A= 65 ~ 90 총 32 차이가 난다
			if(x>=65 && x<= 90) answer += (char)(x+32);
			else answer += (char)(x-32);
		}
		
		return answer;
	}
	
	public static void main(String[]args) {
		Change_CharUpLow main = new Change_CharUpLow();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(main.solution(str));
		
		
	}

}
