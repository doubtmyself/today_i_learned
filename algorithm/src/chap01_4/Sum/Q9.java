package chap01_4.Sum;

import java.util.Scanner;
//���콺 ��� ���� a~b����
public class Q9 {
	static int sumOf(int a, int b) {
		double sum = 0;
		sum = (a + b) * ((b - a + 1) / 2.);
		return (int) sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.println("a�� �Է��ϼ���");
		int a = in.nextInt();
		System.out.println("b�� �Է��ϼ���");
		int b = in.nextInt();
		System.out.println("a~b������ ����"+sumOf(a,b));
		in.close();
	}
}
