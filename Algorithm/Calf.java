package algorithmTest;

/*송아지 찾기*/
import java.util.*;
import java.io.*;

public class Calf {

	public int bfs(int s, int e) {
		int level = 0;
		int[] dis = { -1, 1, 5 };
		boolean[] check = new boolean[10001];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(s);

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				int tmp = queue.poll();
				for (int j : dis) {
					int t2 = tmp+j;
					if (t2 == e)
						return level + 1;
					if (t2 >= 1 && t2 <= 10000 && !check[t2]) {
						check[t2] = true;
						queue.offer(t2);
					}
				}
			}
			level++;

		}

		return level;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Calf c = new Calf();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		System.out.print(c.bfs(s, e));
	}

}
