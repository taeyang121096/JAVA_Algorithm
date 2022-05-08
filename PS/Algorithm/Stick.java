/* ¼è¸·´ë±â*/

import java.util.*;

public class Stick {

    public int solution(String str){
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        char tmp = str.charAt(0);
        for(char c: str.toCharArray()){
            if(c=='(') stack.push(c);
            else{
                if (c==tmp){
                    stack.pop();
                    ans++;
                }
                else{
                    stack.pop();
                    ans += stack.size();
                }
            }
            tmp = c;
        }

        return ans;
    }

    public static void main(String[]args){

        Stick s = new Stick();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(s.solution(str));

    }
    
}
