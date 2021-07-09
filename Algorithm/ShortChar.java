/// 가장 짧은 문자거리
import java.util.*;
public class ShortChar {
	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		for(char x : str.toCharArray()) {
			if (x == c) {
				answer[str.indexOf(x)] = 0;
				System.out.println(x);
			}
		}
		for(int i : answer) {
			System.out.print(i);
		}
		
		return answer;
	}
	
	public static void main(String[]args) {
		ShortChar t = new ShortChar();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		t.solution(str, c);
		 
	}

}
