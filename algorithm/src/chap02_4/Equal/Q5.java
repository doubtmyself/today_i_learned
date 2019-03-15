package chap02_4.Equal;

import java.util.Random;
import java.util.Scanner;

/**
 * �迭 Q5�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy �ۼ�
 * 
 * @author reg13
 *
 */
public class Q5 {

	public static boolean equals(int a[], int b[]) {
		boolean check;
		if (b.length == a.length) {
			System.out.println("b��a�� ���̰� �����ϴ�.");
			check = true;
		} else {
			System.out.println("b��a�� ���̰� ���� �ʽ��ϴ�.");
			System.out.println("�ٽ� �Է��ϼ���");
			check = false;
		}

		return check;
	}

	public static void rcopy(int a[], int b[]) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
	}

	public static void print(int a[], int b[]) {
		System.out.println("�Էµ� b�� ��� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println("\n����� �迭 b�� ��� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int a[];
		int b[];
		do {
			System.out.println("a�� ��ڼ��� �Է��ϼ���");
			int aNum = in.nextInt();
			a = new int[aNum];
			System.out.println("b�� ��ڼ��� �Է��ϼ���");
			int bNum = in.nextInt();
			b = new int[bNum];
		} while (!equals(a, b));

		System.out.println("b�� ��� �������� �Է��մϴ�.");
		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(101) - 50;
		}
		rcopy(a, b);
		print(a, b);

		in.close();

	}

}
