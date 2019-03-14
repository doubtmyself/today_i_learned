package chap01_1.MinMax;

import java.util.Scanner;

public class Q1 {
	static int max(int a, int b, int c, int d) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;
		return max;
	}

	static int min(int a, int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("값 4개를 입력하세요");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println("최대값은" + max(a, b, c, d));
		System.out.println("최소값은" + min(a, b, c, d));
		in.close();
	}
}
