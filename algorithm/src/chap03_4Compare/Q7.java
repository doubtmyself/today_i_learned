package chap03_4Compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 내림차순 정렬 <> 오름차순 정렬 ><
 * 정렬이 되어있어야 탐색 가능
 * 
 * @author reg13
 *
 */
public class Q7 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + "|" + height + "|" + vision;
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		public static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;

			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PhyscData[] x = { // 키의 오름차순으로 정렬되어 있습니다.
				new PhyscData("이수민", 175, 2.0), new PhyscData("홍준기", 171, 1.5), new PhyscData("이호연", 174, 1.2),
				new PhyscData("김한결", 169, 0.8), new PhyscData("전서현", 173, 0.7), new PhyscData("유지훈", 168, 0.4),
				new PhyscData("이나령", 162, 0.3), };
		System.out.println("검색할 시력을 입력하시오");
		double key = in.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, key), PhyscData.HEIGHT_ORDER);

		if (idx < 0)
			System.out.println("요소가 없습니다");
		else {
			System.out.println("x[" + idx + "]에 있습니다");
			System.out.println("찾는 데이터 : " + x[idx]);
		}
		in.close();

	}
}
