package chap03_1LineSerch;

import java.util.Scanner;

/**
 * seqSearchSen �޼��� while���� for������ ����
 * 
 * @author reg13
 *
 */
public class Q1 {

	static int seqSearchSen(int[] array, int range, int key) {
		int i = 0;
		array[range] = key;
		// while (true) {
		// if (a[i] == key)// if �ѹ��� ���
		// break;
		// i++;
		// }
		for (i = 0; i < range; i++)
			if (array[i] == key)
				break;
		return i == range ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = in.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = in.nextInt();
		}

		System.out.println("�˻��� �� : ");
		int key = in.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");
		in.close();
	}
}
