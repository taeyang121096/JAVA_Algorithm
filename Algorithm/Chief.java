/*학급 회장*/

import java.util.*;

public class Chief {

    public char solution(HashMap<Character, Integer> cand) {
        char ans = ' ';
        int count = 0;
        for (Character c : cand.keySet()) {
            if (count < cand.get(c)){
                count = cand.get(c);
                ans = c;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Chief c = new Chief();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vote = sc.next();
        HashMap<Character, Integer> cand = new HashMap<>();
        for (char name : vote.toCharArray()) {
            /*
            if (cand.containsKey(name)) {
                cand.replace(name, cand.get(name) + 1);
            } else
                cand.put(name, 1);
                */
            cand.put(name,cand.getOrDefault(name,0)+1);

        }
        System.out.print(c.solution(cand));

    }

}
