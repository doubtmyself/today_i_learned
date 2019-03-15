package chap02_5.Antilogarithm;

import java.util.Scanner;

// Q6:�Ʒ��ڸ� ���� ���
// for�� ��� ++���°� ����
// ++�� +1�� �ϰ� while�� Ż���Ѵ� -1�� ��Ȱȭ����
public class Q6 {
	static int NumChange(int num, int cm, char[] inNum) {
		int digit = 0;
		String selectNum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			inNum[digit++] = selectNum.charAt(num % cm); // �������� ���� cn������
															// �������,
			num /= cm; // inNum�� cn������ ��ȯ�� ���ڰ� ���� ������ ���� ���� �ڸ��� �Է� �� ���ڸ�����
						// �ԷµǴ� ����Ҷ� ��������
		} while (num != 0);
		return digit;// for�� ��½� �̿�

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cm;
		char[] inNum = new char[32];
		do {
			System.out.println("10������ �Է��ϼ���");// ���� x
			num = in.nextInt();
		} while (num < 0);
		do {
			System.out.println("10������ �ٲ� ������ �Է��ϼ���");// 2~36
			cm = in.nextInt();
		} while (!(cm >= 2 && cm <= 36));
		int dno = NumChange(num, cm, inNum);
		System.out.println("�Ųٷ� ��������");
		for (int i = 0; i <= dno - 1; i++) {// �Ʒ��ڸ����� ���, ++�� +1�� �ϰ� while�� Ż���Ѵ�
											// -1�� ��Ȱȭ����
			System.out.print(inNum[i]);
		}
		in.close();

	}

}
