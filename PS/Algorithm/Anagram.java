/* 아나그램(해쉬) */

import java.util.*;
/* HashMap => method : getOrDefault(key,value) => 없을 경우 value를 반환한다 & containsKey(key) */
public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String ans = "YES";
        for (Character c : str1.toCharArray()) {
            if (map1.containsKey(c))
                map1.put(c, map1.get(c) + 1);
            else
                map1.put(c, 1);
        }
        for (Character c : str2.toCharArray()) {
            if (map2.containsKey(c))
                map2.put(c, map2.get(c) + 1);
            else
                map2.put(c, 1);
        }

        for (char c : map1.keySet()) {
            if (map2.containsKey(c)) {
                if (map1.get(c) != map2.get(c)) {
                    ans = "NO";
                    break;
                }
            } else {
                ans = "NO";
                break;
            }
        }
        System.out.print(ans);
    }

}
