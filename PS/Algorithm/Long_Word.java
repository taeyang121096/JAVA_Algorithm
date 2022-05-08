import java.util.*;
/// 문장속 단어

public class Long_Word {
	
	public String solution(String str) {
		String answer="";
		int m = Integer.MIN_VALUE;
		int pos = 0;
		/*
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		*/
		while((pos=str.indexOf(" "))!=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
				
			}
			str = str.substring(pos+1);
			
		}
		if (str.length()>m) answer = str;
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long_Word T = new Long_Word();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
		

	}

}
