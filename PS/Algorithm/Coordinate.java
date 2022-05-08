package algorithmTest;
/*ÁÂÇ¥ Á¤·Ä*/

import java.util.*;

class Point implements Comparable<Point> {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(this.x==o.x) return this.y - o.y;
		else return this.x - o.x;
		}

}

public class Coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Point(x,y));
		}
		Collections.sort(list);
		for(Point p : list) System.out.println(p.x+" "+p.y);

	}

}
