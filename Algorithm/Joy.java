import java.util.*;
class Solution {
    //     A = 65 Z=90, AAAA 초기 값
    public int solution(String name) {
        int answer = 0;
        int first = (int)'A';
        int last = (int)'Z';
        int count = -1;
        int countr = -1;

        for(int i=0;i<name.length();i++){
            count++;
            if(i==name.length()-1 && name.charAt(i) == 'A'){
                count--;
                continue;
            }
            int f = name.charAt(i) - first;
            int l = last - name.charAt(i) + 1;
            count += Math.min(f,l);
        }

        for(int i = name.length()-1;i>=0;i-- ){
            countr++;
            if(i==1 && name.charAt(i) == 'A'){
                countr--;
                continue;
            }
            int f = name.charAt(i) - first;
            int l = last - name.charAt(i) + 1;
            countr += Math.min(f,l);
        }
        answer = Math.min(count,countr);


        return answer;
    }
}