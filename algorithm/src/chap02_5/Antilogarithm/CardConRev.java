package chap02_5.Antilogarithm;

import java.util.Scanner;

/**
 * Antilogarithm 진수, 역대수 10진수를 2~36진수로 변환하여 나타내는 프로그래밍
 * 
 * @author reg13
 *
 */
public class CardConRev {
	static int cardConvR(int num, int cn, char[] d) {
		// num: 10진수로 표현된 숫자cn : 진수 = 집합의 크기를 나타낸 수, char r진수로 표현된 num
		int digit = 0; // 숫자, 손&발가락 -> n번째 자리수로 이용
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";// 자리수 문자 10이상은
																// 알파벳으로 표현한다.
		do {
			d[digit++] = dchar.charAt(num % cn);
			num /= cn;
		} while (num != 0);
		return digit;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cn;// cardinal number: 집합의 크기를 나타낸 수
		int di;// digit: 자릿수
		char d[] = new char[32];
		int retry = 0;
		
		System.out.println("10진수를 다른 진수로 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수");
				num = in.nextInt();
			} while (num < 0);

			do {
				System.out.println("어떤 진수로 변환할까요?(2~36)");
				cn = in.nextInt();
			} while (!(cn >= 2 && cn <= 36));
			di = cardConvR(num, cn, d);

			System.out.println(cn + "진수로는 ");
			for (int i = di - 1; i >= 0; i--)// i return 받은 자리수로 시작
				System.out.print(d[i]);
			System.out.println("입니다.");
			System.out.println("한번더 하시겠습니까?(0:종료)");
			retry = in.nextInt();

		} while (retry != 0);
		System.out.println("종료했습니다.");
		in.close();
		System.exit(0);
	}
}
