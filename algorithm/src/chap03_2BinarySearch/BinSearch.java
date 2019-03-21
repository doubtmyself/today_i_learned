package chap03_2BinarySearch;

import java.util.Scanner;
/**
 * �����迭
 * �����迭�� �������� �Ǵ� �������� ������ �Ǿ��־�� �Ѵ�!!!
 * 
 * @author reg13
 *
 */
public class BinSearch {
	static int binSearch(int[] array, int range, int key) {
		int first = 0; // �˻� �ʱⰪ
		int end = range - 1; // ������ �˻���

		do {
			int mid = (first + end) / 2;
			if (array[mid] == key)
				return mid; // �˻� �Ϸ�
			else if (array[mid] < key)
				first = mid + 1; //�߾Ӱ� +1 ���� �˻� �ʱⰪ ���� -> �߰�+1���� �迭 ������ �˻�
			else
				end = mid - 1; //������ ��� �� -1�� ���� -> �迭 ó������ �߰�-1���� �˻�

		} while (first <= end);
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("��ڼ� : ");
		int range = in.nextInt();
		int[] array = new int[range];

		System.out.print("x[0] : ");
		array[0] = in.nextInt();//x[0]�� for������ ���� -> i�� 1�϶� x[i] < x[i - 1] ���� ����

		for (int i = 1; i < range; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				array[i] = in.nextInt();
			} while (array[i] < array[i - 1]);//�Էµ� ���� �տ� ������ ������ �ٽ� �Է� -> ��������(���� ���ڰ� ����) ����

		}
		System.out.println("�˻��� �� : ");
		int key = in.nextInt();
		int idx = binSearch(array, range, key);// ���ڴ� �⺻�� ���� �������� �޾ƾ� �Ѵ�.

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");
		in.close();

	}

}
