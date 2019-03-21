package chap03_1LineSerch;

import java.util.Scanner;

/**
 * seqSearchSen 메서드 while문을 for문으로 변경
 * 
 * @author reg13
 *
 */
public class Q1 {

	static int seqSearchSen(int[] array, int range, int key) {
		int i = 0;
		array[range] = key;
		// while (true) {
		// if (a[i] == key)// if 한번만 사용
		// break;
		// i++;
		// }
		for (i = 0; i < range; i++)
			if (array[i] == key)
				break;
		return i == range ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = in.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = in.nextInt();
		}

		System.out.println("검색할 값 : ");
		int key = in.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1)
			System.out.println("그 값은 요소가 없습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");
		in.close();
	}
}
