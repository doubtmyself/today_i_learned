package chap02_5.Antilogarithm;

import java.util.Scanner;

/**
 * Antilogarithm ����, ����� 10������ 2~36������ ��ȯ�Ͽ� ��Ÿ���� ���α׷���
 * 
 * @author reg13
 *
 */
public class CardConRev {
	static int cardConvR(int num, int cn, char[] d) {
		// num: 10������ ǥ���� ����cn : ���� = ������ ũ�⸦ ��Ÿ�� ��, char r������ ǥ���� num
		int digit = 0; // ����, ��&�߰��� -> n��° �ڸ����� �̿�
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";// �ڸ��� ���� 10�̻���
																// ���ĺ����� ǥ���Ѵ�.
		do {
			d[digit++] = dchar.charAt(num % cn);
			num /= cn;
		} while (num != 0);
		return digit;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cn;// cardinal number: ������ ũ�⸦ ��Ÿ�� ��
		int di;// digit: �ڸ���
		char d[] = new char[32];
		int retry = 0;
		
		System.out.println("10������ �ٸ� ������ ��ȯ�մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ����");
				num = in.nextInt();
			} while (num < 0);

			do {
				System.out.println("� ������ ��ȯ�ұ��?(2~36)");
				cn = in.nextInt();
			} while (!(cn >= 2 && cn <= 36));
			di = cardConvR(num, cn, d);

			System.out.println(cn + "�����δ� ");
			for (int i = di - 1; i >= 0; i--)// i return ���� �ڸ����� ����
				System.out.print(d[i]);
			System.out.println("�Դϴ�.");
			System.out.println("�ѹ��� �Ͻðڽ��ϱ�?(0:����)");
			retry = in.nextInt();

		} while (retry != 0);
		System.out.println("�����߽��ϴ�.");
		in.close();
		System.exit(0);
	}
}
