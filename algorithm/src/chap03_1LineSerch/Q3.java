package chap03_1LineSerch;

import java.util.Scanner;

public class Q3 {
	/**
	 * �迭�� Ű �տ� ���� �����ϰ� �����ϴ� �޼ҵ�
	 * 
	 * @param a
	 * @param n
	 * @param key
	 * @param idx
	 * @return
	 */
	static int seqSearchSen(int[] array, int range, int key) {
		int i = 0;
		for (i = 0; i < range; i++) {
			if (key == array[i])
				break;
		}
		return i == range ? -1 : i;
	}

	static int searchIdx(int[] array, int range, int key, int[] outArray) {
		int i = 0;
		int j = 0;
		for (i = 0; i < range; i++) {
			if (key == array[i])
				break;
		}
		for (j = 0; j < i; j++) {
			outArray[j] = array[j];
		}
		return i == range ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��ڼ��� �Է��ϼ���");
		int range = in.nextInt();
		int array[] = new int[range + 1];
		for (int i = 0; i < range; i++) {
			System.out.print("array[" + i + "] =");
			array[i] = in.nextInt();
		}
		System.out.println("�˻��� ���� �Է��ϼ���");
		int key = in.nextInt();
		array[range] = key;
		int outArray[] = new int[range];
		int idx = seqSearchSen(array, range, key);
		if (idx == -1)
			System.out.println("�迭�� ã�� ���� �����ϴ�.");
		else {
			System.out.println("�迭���");
			for (int i = 0; i < range; i++) {
				System.out.printf("%3d", array[i]);
			}
			System.out.println("\n�̻��� = " + array[idx]);
		}
		int idx2=searchIdx(array, range, key, outArray);
		System.out.println("�˻��� �� ���� ���");
		if (idx == -1)
			System.out.println("�迭�� ã�� ���� �����ϴ�.");
		else {
			for (int i = 0; i < idx2; i++) {
				System.out.printf("%3d", array[i]);
			}
		}
		in.close();
	}
}
