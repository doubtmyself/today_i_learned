package chap01_4.Sum;

import java.util.Scanner;
//�ڸ��� ���
public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int temp = 0;
		int check;
		System.out.println("�ڸ����� ����ϴ� ���α׷��Դϴ�. ���ڸ� �Է��ϼ���");
		a = in.nextInt();
		check = a;
		do {
			check /= 10;
			temp++;
		} while (check != 0);
		System.out.println(a + "�� " + temp + "�ڸ��� �Դϴ�.");
		in.close();

	}
}
