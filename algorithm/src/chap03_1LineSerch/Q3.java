package chap03_1LineSerch;

import java.util.Scanner;

public class Q3 {
	/**
	 * 배열의 키 앞에 값을 제외하고 제거하는 메소드
	 * 
	 * @param a
	 * @param n
	 * @param key
	 * @param idx
	 * @return
	 */
	static int seqSearchSen(int[] array, int range, int key) {
		int i = 0;
		for (i = 0; i < range; i++) {
			if (key == array[i])
				break;
		}
		return i == range ? -1 : i;
	}

	static int searchIdx(int[] array, int range, int key, int[] outArray) {
		int i = 0;
		int j = 0;
		for (i = 0; i < range; i++) {
			if (key == array[i])
				break;
		}
		for (j = 0; j < i; j++) {
			outArray[j] = array[j];
		}
		return i == range ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("요솟수를 입력하세요");
		int range = in.nextInt();
		int array[] = new int[range + 1];
		for (int i = 0; i < range; i++) {
			System.out.print("array[" + i + "] =");
			array[i] = in.nextInt();
		}
		System.out.println("검색할 값을 입력하세요");
		int key = in.nextInt();
		array[range] = key;
		int outArray[] = new int[range];
		int idx = seqSearchSen(array, range, key);
		if (idx == -1)
			System.out.println("배열에 찾는 값이 없습니다.");
		else {
			System.out.println("배열출력");
			for (int i = 0; i < range; i++) {
				System.out.printf("%3d", array[i]);
			}
			System.out.println("\n겁색값 = " + array[idx]);
		}
		int idx2=searchIdx(array, range, key, outArray);
		System.out.println("검색값 앞 까지 출력");
		if (idx == -1)
			System.out.println("배열에 찾는 값이 없습니다.");
		else {
			for (int i = 0; i < idx2; i++) {
				System.out.printf("%3d", array[i]);
			}
		}
		in.close();
	}
}
