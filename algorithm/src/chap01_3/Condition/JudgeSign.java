package chap01_3.Condition;

import java.util.Scanner;
//���� �Ǻ�
public class JudgeSign {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int n = in.nextInt();
		if (n > 0)
			System.out.println("����Դϴ�.");
		else if (n < 0)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�� ���� 0 �Դϴ�.");
		in.close();

	}
}
