package algorithmTest;

/* 가위 바위 보 */
import java.util.*;

public class Game {

	public void solution(int n, int[] A, int[] B) {

		for (int i = 0; i < n; i++) {
			if (A[i]==B[i])
				System.out.println("D");
			else if(Math.abs(A[i]-B[i]) == 1) {
				if (A[i] > B[i]) {
					System.out.println("A");
				}else {
					System.out.println("B");
				}
			}
			else {
				if (A[i] > B[i]) {
					System.out.println("B");
				}else {
					System.out.println("A");
				}
				
			}

		}

	}

	public static void main(String[] args) {

		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n], B = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		g.solution(n, A, B);

	}

}
