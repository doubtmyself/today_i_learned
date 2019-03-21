package chap03_1LineSerch;

import java.util.Scanner;

class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)// 불러온 요솟수와 비교 -> 요솟수와 i값이 같다면 배열 안 검색 실패
				return -1;
			if (a[i] == key)// 불러온 key 값과 비교 같다면 몇번째 배열에 값이 있는지 알리기 위해 i를 리턴
				return i;
			i++;
		}
	}

	static int seqSearchFor(int[] a, int n, int key) {
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				return i;
		return -1;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("요솟수 : ");
		int num = in.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = in.nextInt();

		}

		System.out.println("검색할 값 : ");
		int key = in.nextInt();

		int idx = seqSearch(x, num, key);

		if (idx == -1)
			System.out.println("검색에 실패했습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 존재합니다.");
		System.out.println("For문으로 만든 선형검색");
		idx = seqSearchFor(x, num, key);

		if (idx == -1)
			System.out.println("검색에 실패했습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 존재합니다.");
		in.close();
	}

}
