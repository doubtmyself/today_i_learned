package chap01_1.MinMax;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("세 정수의 최대값");
		System.out.println("a 값 입력 :"); int a= in.nextInt();
		System.out.println("b 값 입력 :"); int b= in.nextInt();
		System.out.println("c 값 입력 :"); int c= in.nextInt();
		int max =a;
		if(b > max) max = b;
		if(c > max) max = c;
		System.out.println("최대값은" +max);
		in.close();
	}

}
