package chap02_4.Equal;

import java.util.Scanner;
// Q4: a의 배열을 b에 입력하는 함수 
public class Q4 {

	public static void equals(int a[], int b[]) {
		if (a.length == b.length) {
			copy(a, b);
		} else
			System.out.println("a와 b의 길이가 같지 않습니다.");
	}

	public static void copy(int a[], int b[]) {
		b = a.clone();
		print(a, b);
	}

	public static void print(int a[], int b[]) {
		System.out.println("입력된 a의 요소 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n복사된 배열 b의 요소 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("a의 요솟수를 입력하세요");
		int aNum = in.nextInt();
		int a[] = new int[aNum];
		System.out.println("b의 요솟수를 입력하세요");
		int bNum = in.nextInt();
		int b[] = new int[bNum];
		System.out.println("a의 요소 입력");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		equals(a, b);
		in.close();

	}

}
