package chap03_2BinarySearch;
import java.util.Scanner;


class Q4 {
	// �迭 a�� ���� n�� ��ҿ��� key�� ���� ��Ҹ� ���� �˻� (���ʹ�)
	static int binSearchEx(int[] array, int range, int key) {
		System.out.print("   |");
		for (int k = 0; k < range; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * range + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // �˻����� �� ���� index
		int pr = range - 1; // �˻����� �� ���� index

		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < range; k++)
				System.out.printf("%4d", array[k]);
			System.out.println("\n   |");
			if (array[pc] == key)
				return pc; // �˻�����
			else if (array[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);
		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("��ڼ���");
		int range = in.nextInt();
		int[] array = new int[range]; // ��ڼ� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��"); // �� �� ��Ҹ� �о� ����
		array[0] = in.nextInt();

		for (int i = 1; i < range; i++) {
			do {
				System.out.print("x[" + i + "]��");
				array[i] = in.nextInt();
			} while (array[i] < array[i - 1]); // �ϳ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int key = in.nextInt();

		int idx = binSearchEx(array, range, key); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");
		in.close();
	}
}
