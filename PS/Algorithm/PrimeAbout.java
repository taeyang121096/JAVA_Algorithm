import java.util.*;

class Solution {
    static Set<String> set = new HashSet<>();
    static boolean[] check;
    void permutation(char[] num, String str, int level){
        if(level == 0){
            if(str.charAt(0) == '0')
                str = change(str);
            set.add(str);
            return;
        }
        for(int i = 0;i<num.length;i++){
            if(check[i])
                continue;
            check[i] = true;
            permutation(num,str+num[i],level-1);
            check[i] = false;
        }

    }

    String change(String str){
        int indx=0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != '0'){
                indx = i;
                break;
            }
        }
        return str.substring(indx);

    }

    boolean prime(int value){
        if(value  <= 1)
            return false;
        for(int i = 2;i<value;i++){
            if(value % i == 0)
                return false;
        }
        return true;
    }
    public int solution(String numbers) {
        int answer = 0;
        check = new boolean[numbers.length()];

        for(int i = 1;i<=numbers.length();i++){
            permutation(numbers.toCharArray(),"",i);
        }


        for(String str : set){

            if(prime(Integer.parseInt(str))){
                answer++;
            }
        }



        return answer;
    }
}