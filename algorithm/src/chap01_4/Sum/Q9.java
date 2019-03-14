package chap01_4.Sum;

import java.util.Scanner;
//가우스 방법 응용 a~b까지
public class Q9 {
	static int sumOf(int a, int b) {
		double sum = 0;
		sum = (a + b) * ((b - a + 1) / 2.);
		return (int) sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.println("a를 입력하세요");
		int a = in.nextInt();
		System.out.println("b를 입력하세요");
		int b = in.nextInt();
		System.out.println("a~b까지의 합은"+sumOf(a,b));
		in.close();
	}
}
