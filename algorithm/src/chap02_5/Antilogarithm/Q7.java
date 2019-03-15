package chap02_5.Antilogarithm;

import java.util.Scanner;

// 변환과정 서술
public class Q7 {
	static int NumChange(int num, int cm, char[] inNum) {
		int digit = 0;
		String selectNum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(cm + "|" + "\t" + num );
		inNum[digit++] = selectNum.charAt(num % cm); 
		num /= cm;
		do {
			System.out.println(" +---------");
			System.out.println(cm + "|" + "\t" + num + "  ->  " + inNum[digit-1]);
			inNum[digit++] = selectNum.charAt(num % cm); // 나머지가 들어가야 cm진수로
															// 만들어짐,
			num /= cm; // inNum에 cm진수로 변환된 숫자가 들어가면 나누셈 실행 다음 자리수 입력 단 앞자리부터
						// 입력되니 출력할때 주의하자
		} while (num != 0);
		System.out.println(" +---------");
		System.out.println("\t" + num + "  ->  " + inNum[digit-1]);
		return digit;// for문 출력시 이용

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cm;
		char[] inNum = new char[32];
		int retry;
		do {
			do {
				System.out.println("10진수를 입력하세요");// 음수 x
				num = in.nextInt();
			} while (num < 0);
			do {
				System.out.println("10진수를 바꿀 진수를 입력하세요");// 2~36
				cm = in.nextInt();
			} while (!(cm >= 2 && cm <= 36));
			int dno = NumChange(num, cm, inNum);
			System.out.println(cm + "진수로 변환한 값은");
			for (int i = dno - 1; i >= 0; i--) {
				System.out.print(inNum[i]);
			}
			System.out.println("연산을 한번더 하시겠습니까?(1:재시작");
			retry = in.nextInt();
		} while (retry == 1);
		in.close();
	}

}
