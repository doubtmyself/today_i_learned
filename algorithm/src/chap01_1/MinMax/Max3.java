package chap01_1.MinMax;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�� ������ �ִ밪");
		System.out.println("a �� �Է� :"); int a= in.nextInt();
		System.out.println("b �� �Է� :"); int b= in.nextInt();
		System.out.println("c �� �Է� :"); int c= in.nextInt();
		int max =a;
		if(b > max) max = b;
		if(c > max) max = c;
		System.out.println("�ִ밪��" +max);
		in.close();
	}

}
