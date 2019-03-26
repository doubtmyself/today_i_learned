package chap03_3BinaryMethod;

import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch�� ���� �˻�

class BinarySearchTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = in.nextInt();
		int[] x = new int[num];

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��");
		x[0] = in.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = in.nextInt();
			} while (x[i] < x[i - 1]); // �ٷ� ���� ��Һ��� ������ �ٽ� �Է��մϴ�.
		}

		System.out.print("�˻��� ����");
		int key = in.nextInt();

		int idx = Arrays.binarySearch(x, key);
		// �迭 x���� Ű ���� key�� ��Ҹ� �˻� import java.util.Arrays �ʿ�
		// ������ �ߺ��� ���ý� �˻�������� ����
		if (idx < 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		in.close();
	}
}