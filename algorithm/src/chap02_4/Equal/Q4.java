package chap02_4.Equal;

import java.util.Scanner;
// Q4: a�� �迭�� b�� �Է��ϴ� �Լ� 
public class Q4 {

	public static void equals(int a[], int b[]) {
		if (a.length == b.length) {
			copy(a, b);
		} else
			System.out.println("a�� b�� ���̰� ���� �ʽ��ϴ�.");
	}

	public static void copy(int a[], int b[]) {
		b = a.clone();
		print(a, b);
	}

	public static void print(int a[], int b[]) {
		System.out.println("�Էµ� a�� ��� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n����� �迭 b�� ��� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("a�� ��ڼ��� �Է��ϼ���");
		int aNum = in.nextInt();
		int a[] = new int[aNum];
		System.out.println("b�� ��ڼ��� �Է��ϼ���");
		int bNum = in.nextInt();
		int b[] = new int[bNum];
		System.out.println("a�� ��� �Է�");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		equals(a, b);
		in.close();

	}

}
