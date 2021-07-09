/// 숫자만 추출
import java.util.*;
public class JustNum {
	
	public void solution(String str) {
		str = str.replaceAll("[^0-9]", "");
		
		System.out.print(Integer.parseInt(str));
		
	}
	
	public static void main(String[]args) {
		JustNum t = new JustNum();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		t.solution(str);
		
		
		
	}

}
