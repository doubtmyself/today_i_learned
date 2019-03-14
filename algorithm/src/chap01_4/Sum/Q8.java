package chap01_4.Sum;

import java.util.Scanner;
//합출력 3 가우스 방법
public class Q8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다. n을 입력하세요");
		int n = in.nextInt();
		double sum = (1+n)*((double)n/2);
		System.out.println("n까지의 합은"+sum);
		in.close();
	}

}
