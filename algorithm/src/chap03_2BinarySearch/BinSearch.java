package chap03_2BinarySearch;

import java.util.Scanner;
/**
 * 이진배열
 * 이진배열은 오름차순 또는 내림차순 정렬이 되어있어야 한다!!!
 * 
 * @author reg13
 *
 */
public class BinSearch {
	static int binSearch(int[] array, int range, int key) {
		int first = 0; // 검색 초기값
		int end = range - 1; // 마지막 검색값

		do {
			int mid = (first + end) / 2;
			if (array[mid] == key)
				return mid; // 검색 완료
			else if (array[mid] < key)
				first = mid + 1; //중앙값 +1 값을 검색 초기값 지정 -> 중간+1부터 배열 끝까지 검색
			else
				end = mid - 1; //끝값을 가운데 값 -1로 지정 -> 배열 처음부터 중간-1까지 검색

		} while (first <= end);
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("요솟수 : ");
		int range = in.nextInt();
		int[] array = new int[range];

		System.out.print("x[0] : ");
		array[0] = in.nextInt();//x[0]을 for문전에 정의 -> i가 1일때 x[i] < x[i - 1] 연산 가능

		for (int i = 1; i < range; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				array[i] = in.nextInt();
			} while (array[i] < array[i - 1]);//입력된 값이 앞에 값보다 작으면 다시 입력 -> 오름차순(점점 숫자가 증가) 정렬

		}
		System.out.println("검색할 값 : ");
		int key = in.nextInt();
		int idx = binSearch(array, range, key);// 숫자는 기본형 변수 리턴으로 받아야 한다.

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");
		in.close();

	}

}
