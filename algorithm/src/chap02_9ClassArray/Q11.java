package chap02_9ClassArray;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int retry;

		do {
			System.out.println("날짜 연산.");
			System.out.println("년 : ");
			int y = in.nextInt();
			System.out.println("월 : ");
			int m = in.nextInt();
			System.out.println("일 : ");
			int d = in.nextInt();
			YMD today = new YMD(y, m, d);
			today.dayOfYear();
			System.out.println(today.y + "년" + today.m + "월" + today.d + "일");

			System.out.println("1번: n일 뒤에 날짜를 반환합니다.");
			System.out.println("2번: n일 전에 날짜를 반환합니다.");
			System.out.println("0번: 종료됩니다");
			System.out.println("다른 숫자를 누르시면 다시 날짜를 계산합니다.");
			retry = in.nextInt();

			if (retry == 1) {
				System.out.println("n일 뒤를 입력하세요");
				today.afterDay(in.nextInt());
				System.out.println(today.y + "년" + today.m + "월" + today.d + "일");
				continue;
			} else if (retry == 2) {
				System.out.println("n일 전을 입력하세요");
				today.beforeDay(in.nextInt());
				System.out.println(today.y + "년" + today.m + "월" + today.d + "일");
				continue;
			} else if (retry == 3) {
				break;
			}
		} while (true);
		in.close();

	}
}
