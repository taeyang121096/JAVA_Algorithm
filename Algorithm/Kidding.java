/*장난 꾸러기 */

import java.util.*;

public class Kidding {

    public ArrayList<Integer> solution(int n, int[] arr) {
        int[] tmp = arr.clone();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i])
                list.add(i + 1);
        }

        return list;

    }

    public static void main(String[] args) {
        Kidding k = new Kidding();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int x : k.solution(n, arr))
            System.out.print(x+" ");

    }

}
