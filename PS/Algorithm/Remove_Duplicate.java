import java.util.*;
/// 중복 제거 문자열

public class Remove_Duplicate {
	
	public String solution(String str) {
		String answer = "";
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Remove_Duplicate t = new Remove_Duplicate();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(t.solution(str));

	}

}
