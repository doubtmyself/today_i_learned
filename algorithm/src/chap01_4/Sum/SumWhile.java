package chap01_4.Sum;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��:");
		int n = in.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1����" + n + "������ ����" + sum + "�Դϴ�");
		in.close();
	}

}
