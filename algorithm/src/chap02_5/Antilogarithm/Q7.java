package chap02_5.Antilogarithm;

import java.util.Scanner;

// ��ȯ���� ����
public class Q7 {
	static int NumChange(int num, int cm, char[] inNum) {
		int digit = 0;
		String selectNum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(cm + "|" + "\t" + num );
		inNum[digit++] = selectNum.charAt(num % cm); 
		num /= cm;
		do {
			System.out.println(" +---------");
			System.out.println(cm + "|" + "\t" + num + "  ->  " + inNum[digit-1]);
			inNum[digit++] = selectNum.charAt(num % cm); // �������� ���� cm������
															// �������,
			num /= cm; // inNum�� cm������ ��ȯ�� ���ڰ� ���� ������ ���� ���� �ڸ��� �Է� �� ���ڸ�����
						// �ԷµǴ� ����Ҷ� ��������
		} while (num != 0);
		System.out.println(" +---------");
		System.out.println("\t" + num + "  ->  " + inNum[digit-1]);
		return digit;// for�� ��½� �̿�

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int cm;
		char[] inNum = new char[32];
		int retry;
		do {
			do {
				System.out.println("10������ �Է��ϼ���");// ���� x
				num = in.nextInt();
			} while (num < 0);
			do {
				System.out.println("10������ �ٲ� ������ �Է��ϼ���");// 2~36
				cm = in.nextInt();
			} while (!(cm >= 2 && cm <= 36));
			int dno = NumChange(num, cm, inNum);
			System.out.println(cm + "������ ��ȯ�� ����");
			for (int i = dno - 1; i >= 0; i--) {
				System.out.print(inNum[i]);
			}
			System.out.println("������ �ѹ��� �Ͻðڽ��ϱ�?(1:�����");
			retry = in.nextInt();
		} while (retry == 1);
		in.close();
	}

}
