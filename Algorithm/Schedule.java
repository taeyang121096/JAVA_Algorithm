/*교육과정 설계*/

import java.util.*;

public class Schedule {

    public String solution(String schedule, String str){
        String ans ="YES";
        Queue<Character> queue = new LinkedList<>();
        for(char c : schedule.toCharArray()) queue.offer(c);

        for(char c: str.toCharArray()){
            if(queue.contains(c)){
                if(c != queue.poll()) return "NO";
                
            }
        }
        if(!queue.isEmpty()) return "NO";

        return ans;
    }


    public static void main(String[]args){
        Schedule s = new Schedule();
        Scanner sc = new Scanner(System.in);
        String schedule = sc.next();
        String str = sc.next();

        System.out.print(s.solution(schedule, str));
        

    }
    
}
