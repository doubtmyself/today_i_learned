package chap03_3BinaryMethod;

import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch로 이진 검색

class BinarySearchTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = in.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]：");
		x[0] = in.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = in.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력합니다.
		}

		System.out.print("검색할 값：");
		int key = in.nextInt();

		int idx = Arrays.binarySearch(x, key);
		// 배열 x에서 키 값이 key인 요소를 검색 import java.util.Arrays 필요
		// 하지만 중복값 나올시 검색순서대로 나옴
		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		in.close();
	}
}