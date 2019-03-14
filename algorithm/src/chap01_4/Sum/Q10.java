package chap01_4.Sum;

import java.util.Scanner;
//뺄셈
public class Q10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("b-a를 출력합니다.(b가 a보다 커야합니다)");
		int a;
		int b;
		int min;

		do {
			System.out.println("b를 입력하세요");
			b = in.nextInt();
			System.out.println("a를 입력하세요");
			a = in.nextInt();
		} while (b <= a);
		min = b - a;
		System.out.println("b-a=" + min);
		in.close();

	}

}
