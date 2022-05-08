/*괄호 문자 제거*/

import java.util.*;

public class BracketRemove {
    
    public String solution(String s){
        String ans;
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(c =='(') stack.push(c);
            else if(c==')') stack.pop();
            else{
                if(stack.empty()) sb.append(c);
            }
        }
        ans = sb.toString();


        return ans;
    }

    public static void main(String[]args){
        BracketRemove br = new BracketRemove();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.print(br.solution(s));

    }
}
