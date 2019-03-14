package chap01_4.Sum;

import java.util.Scanner;
//합출력 2 for문 사용
public class Q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구함");
		System.out.print("n의 값:");
		int n = in.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			if(i<n)
			System.out.print("+");
		}
		System.out.println("="+ sum + "입니다");
		in.close();
	}

}
