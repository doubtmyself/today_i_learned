package chap01_4.Sum;

import java.util.Scanner;
//����
public class Q10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("b-a�� ����մϴ�.(b�� a���� Ŀ���մϴ�)");
		int a;
		int b;
		int min;

		do {
			System.out.println("b�� �Է��ϼ���");
			b = in.nextInt();
			System.out.println("a�� �Է��ϼ���");
			a = in.nextInt();
		} while (b <= a);
		min = b - a;
		System.out.println("b-a=" + min);
		in.close();

	}

}
