package chap03_2BinarySearch;

import java.util.Scanner;

class Q5 {
	static int count = 1;

	static int binSearchX(int[] array, int num, int key) {
		int first = 0;
		int end = array.length - 1;
		do {
			int mid = (first + end) / 2;
			if (array[mid] == key) {
				for (; mid > first; mid--)
					if (array[mid - 1] < key) {
					break;
						// 이진 검색 알고리즘은 오름차순으로 정렬 -> 키값보다 작으면 아래값을 검색해도 값이 나올수가 없다.
					}
				return mid;

			} else if (array[mid] < key) // 반이상 검색
				first = mid + 1;
			else
				end = mid - 1; // 절반 이하 검색
		} while (first <= end);
		return -1;
	}

	static boolean equals(int array, int array2) {
		if (array <= array2) {
			System.out.println("입력됩니다.");
			return false;
		}
		System.out.println("다시입력하세요");
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("요솟수를 입력하세요");
		int num = in.nextInt();
		int array[] = new int[num];
		System.out.print("array[0]=");
		array[0] = in.nextInt();
		for (int i = 1; i < array.length; i++) {
			do {
				System.out.print("array[" + i + "]=");
				array[i] = in.nextInt();
			} while (equals(array[i - 1], array[i]));
		}
		System.out.println("검색할 값을 입력하세요");
		int key = in.nextInt();
		num = binSearchX(array, num, key);
		if (num == -1) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			System.out.println("키값의 위치는 arry[" + num + "]");
		}
		in.close();
	}
}