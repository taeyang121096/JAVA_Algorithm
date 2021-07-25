/*후위식 연산 */

import java.util.*;

public class Postfix {

    public int solution(String str) {
        
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) stack.push(Character.getNumericValue(c));
            else {
                int t1 = stack.pop();
                int t2 = stack.pop();
                int tmp = 0;
                switch (c) {
                    case '*':
                        tmp = t2 * t1;
                        break;

                    case '/':
                        tmp = t2 / t1;
                        break;

                    case '+':
                        tmp = t2 + t1;
                        break;

                    case '-':
                        tmp = t2 - t1;
                        break;
                }
                stack.push(tmp);
            }
            
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Postfix p = new Postfix();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(p.solution(str));

    }
}
