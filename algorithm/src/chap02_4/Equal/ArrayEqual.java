package chap02_4.Equal;

import java.util.Scanner;
/**
 * ���׿�����  ? : Ȯ��
 * 
 * @author reg13
 *
 */
public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)//���̺�
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])//��� ��
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ�");
		int na = in.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] :");
			a[i] = in.nextInt();
		}
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = in.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = in.nextInt();
		}
		System.out.println("�迭 a�� b��" + (equals(a, b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		in.close();
	}
}
