package chap01_7.Triangle;

import java.util.Scanner;

public class Q17 {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("피라미드를 출력합니다.");

		do {
			System.out.println("몇층의 피라미드입니까?");
			n = in.nextInt();
		} while (n <= 0);
		npira(n);
		in.close();

	}
}
