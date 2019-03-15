package chap02_4.Equal;

import java.util.Random;
import java.util.Scanner;

/**
 * 배열 Q5의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy 작성
 * 
 * @author reg13
 *
 */
public class Q5 {

	public static boolean equals(int a[], int b[]) {
		boolean check;
		if (b.length == a.length) {
			System.out.println("b와a의 길이가 같습니다.");
			check = true;
		} else {
			System.out.println("b와a의 길이가 같지 않습니다.");
			System.out.println("다시 입력하세요");
			check = false;
		}

		return check;
	}

	public static void rcopy(int a[], int b[]) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
	}

	public static void print(int a[], int b[]) {
		System.out.println("입력된 b의 요소 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("\n복사된 배열 b의 요소 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int a[];
		int b[];
		do {
			System.out.println("a의 요솟수를 입력하세요");
			int aNum = in.nextInt();
			a = new int[aNum];
			System.out.println("b의 요솟수를 입력하세요");
			int bNum = in.nextInt();
			b = new int[bNum];
		} while (!equals(a, b));

		System.out.println("b의 요소 랜덤으로 입력합니다.");
		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(101) - 50;
		}
		rcopy(a, b);
		print(a, b);

		in.close();

	}

}
