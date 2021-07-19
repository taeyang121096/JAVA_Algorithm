/*¿Ã¹Ù¸¥ °ýÈ£ */

import java.util.*;

public class Bracket {

    public String solution(String str){
        String ans = "YES";
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if (c == '('){ 
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()) stack.pop();
                else ans = "NO";
            }
        }
        if(!stack.isEmpty()) ans = "NO";

        return ans;

    }
    public static void main(String[]args){

        Bracket b = new Bracket();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(b.solution(str));

    }
    
}
