package algorithmTest;
 /*가장 높은 탑 쌓기*/
import java.util.*;

class Block implements Comparable<Block>{
	int width,height,weight;
	
	public Block(int width,int height, int weight ) {
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(Block o) {
		
		if(this.width == o.width)
			return this.weight - o.weight;
		return this.width - o.width;
	}
	
	
}
public class Top {
	static int[] dp;
	public void solution(List<Block> list,int n) {
		dp[0] = list.get(0).height;
		
		for(int i =1;i<n;i++) {
			int max =0;
			for(int j = i-1;j>=0;j--) {
				if(list.get(i).weight > list.get(j).weight && max < dp[j] ) max = dp[j];
			}
			dp[i] = max + list.get(i).height;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top t = new Top();
		List<Block> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n];
		for(int i =0;i<n;i++) {
			list.add(new Block(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(list);
		t.solution(list,n);
		System.out.print(Arrays.stream(dp).max().getAsInt());

	}

}
