package chap01_4.Sum;

import java.util.Scanner;
//자리수 출력
public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int temp = 0;
		int check;
		System.out.println("자리수를 출력하는 프로그램입니다. 숫자를 입력하세요");
		a = in.nextInt();
		check = a;
		do {
			check /= 10;
			temp++;
		} while (check != 0);
		System.out.println(a + "는 " + temp + "자리수 입니다.");
		in.close();

	}
}
