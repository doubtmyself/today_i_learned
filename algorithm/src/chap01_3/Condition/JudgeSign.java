package chap01_3.Condition;

import java.util.Scanner;
//숫자 판별
public class JudgeSign {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int n = in.nextInt();
		if (n > 0)
			System.out.println("양수입니다.");
		else if (n < 0)
			System.out.println("음수입니다.");
		else
			System.out.println("이 수는 0 입니다.");
		in.close();

	}
}
