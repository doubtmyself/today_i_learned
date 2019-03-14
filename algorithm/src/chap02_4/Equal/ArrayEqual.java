package chap02_4.Equal;

import java.util.Scanner;
/**
 * 삼항연산자  ? : 확인
 * 
 * @author reg13
 *
 */
public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)//길이비교
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])//요소 비교
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("배열 a의 요솟수");
		int na = in.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] :");
			a[i] = in.nextInt();
		}
		System.out.print("배열 b의 요솟수 : ");
		int nb = in.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = in.nextInt();
		}
		System.out.println("배열 a와 b는" + (equals(a, b) ? "같습니다." : "같지 않습니다."));
		in.close();
	}
}
