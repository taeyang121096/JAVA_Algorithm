package algorithmTest;

/*큰수 출력하기*/
import java.util.*;

public class BigNum {

	public void solution(int[] list) {
		int pre = 0;
		for (int i : list) {
			if (i > pre) {
				System.out.print(i + " ");
				pre = i;
			} else {
				pre = i;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigNum n = new BigNum();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] list = new int[num];
		for (int i = 0; i < num; i++) {
			int number = sc.nextInt();
			list[i] = number;
		}
		n.solution(list);
	

	}

}
