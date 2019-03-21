package chap03_1LineSerch;

import java.util.Scanner;

class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)// �ҷ��� ��ڼ��� �� -> ��ڼ��� i���� ���ٸ� �迭 �� �˻� ����
				return -1;
			if (a[i] == key)// �ҷ��� key ���� �� ���ٸ� ���° �迭�� ���� �ִ��� �˸��� ���� i�� ����
				return i;
			i++;
		}
	}

	static int seqSearchFor(int[] a, int n, int key) {
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				return i;
		return -1;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("��ڼ� : ");
		int num = in.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = in.nextInt();

		}

		System.out.println("�˻��� �� : ");
		int key = in.nextInt();

		int idx = seqSearch(x, num, key);

		if (idx == -1)
			System.out.println("�˻��� �����߽��ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �����մϴ�.");
		System.out.println("For������ ���� �����˻�");
		idx = seqSearchFor(x, num, key);

		if (idx == -1)
			System.out.println("�˻��� �����߽��ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �����մϴ�.");
		in.close();
	}

}
