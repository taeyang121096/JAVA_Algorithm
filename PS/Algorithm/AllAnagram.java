/* 모든 아나그램 찾기 */

import java.util.*;

public class AllAnagram {
    /*
     * public int solution(String s, String t) { int ans = 0; int lt = 0, rt =
     * t.length() - 1; char[] schar = s.toCharArray(); while (rt < s.length()) {
     * HashMap<Character, Integer> map = new HashMap<>(); boolean flag = true; for
     * (Character c : t.toCharArray()) { map.put(c, map.getOrDefault(c, 0) + 1); }
     * 
     * for (int i = lt; i <= rt; i++) { if (map.containsKey(schar[i]) &&
     * (map.get(schar[i]) > 0)) { map.put(schar[i],map.get(schar[i])-1); } else{
     * flag = false; break; }
     * 
     * } if(flag) ans++; lt++; rt++;
     * 
     * }
     * 
     * return ans; }
     */
    

    public static void main(String[] args) {

        AllAnagram a = new AllAnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.print(a.solution(s, t));

    }

}
