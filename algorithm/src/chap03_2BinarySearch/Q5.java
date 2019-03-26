package chap03_2BinarySearch;

import java.util.Scanner;

class Q5 {
	static int count = 1;

	static int binSearchX(int[] array, int num, int key) {
		int first = 0;
		int end = array.length - 1;
		do {
			int mid = (first + end) / 2;
			if (array[mid] == key) {
				for (; mid > first; mid--)
					if (array[mid - 1] < key) {
					break;
						// ���� �˻� �˰����� ������������ ���� -> Ű������ ������ �Ʒ����� �˻��ص� ���� ���ü��� ����.
					}
				return mid;

			} else if (array[mid] < key) // ���̻� �˻�
				first = mid + 1;
			else
				end = mid - 1; // ���� ���� �˻�
		} while (first <= end);
		return -1;
	}

	static boolean equals(int array, int array2) {
		if (array <= array2) {
			System.out.println("�Էµ˴ϴ�.");
			return false;
		}
		System.out.println("�ٽ��Է��ϼ���");
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��ڼ��� �Է��ϼ���");
		int num = in.nextInt();
		int array[] = new int[num];
		System.out.print("array[0]=");
		array[0] = in.nextInt();
		for (int i = 1; i < array.length; i++) {
			do {
				System.out.print("array[" + i + "]=");
				array[i] = in.nextInt();
			} while (equals(array[i - 1], array[i]));
		}
		System.out.println("�˻��� ���� �Է��ϼ���");
		int key = in.nextInt();
		num = binSearchX(array, num, key);
		if (num == -1) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("Ű���� ��ġ�� arry[" + num + "]");
		}
		in.close();
	}
}