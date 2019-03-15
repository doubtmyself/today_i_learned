package chap02_5.Antilogarithm;

import java.util.Scanner;

// Q6:아래자리 부터 출력
// for문 대신 ++쓰는거 연습
// ++은 +1을 하고 while을 탈출한다 -1을 생활화하자
public class Q6 {
	static int NumChange(int num, int cm, char[] inNum) {
		int digit = 0;
		String selectNum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			inNum[digit++] = selectNum.charAt(num % cm); // 나머지가 들어가야 cn진수로
															// 만들어짐,
			num /= cm; // inNum에 cn진수로 변환된 숫자가 들어가면 나누셈 실행 다음 자리수 입력 단 앞자리부터
						// 입력되니 출력할때 주의하자
		} while (num != 0);
		return digit;// for문 출력시 이용

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cm;
		char[] inNum = new char[32];
		do {
			System.out.println("10진수를 입력하세요");// 음수 x
			num = in.nextInt();
		} while (num < 0);
		do {
			System.out.println("10진수를 바꿀 진수를 입력하세요");// 2~36
			cm = in.nextInt();
		} while (!(cm >= 2 && cm <= 36));
		int dno = NumChange(num, cm, inNum);
		System.out.println("거꾸로 읽으세요");
		for (int i = 0; i <= dno - 1; i++) {// 아랫자리부터 출력, ++은 +1을 하고 while을 탈출한다
											// -1을 생활화하자
			System.out.print(inNum[i]);
		}
		in.close();

	}

}
