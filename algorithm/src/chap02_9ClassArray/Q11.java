package chap02_9ClassArray;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int retry;

		do {
			System.out.println("��¥ ����.");
			System.out.println("�� : ");
			int y = in.nextInt();
			System.out.println("�� : ");
			int m = in.nextInt();
			System.out.println("�� : ");
			int d = in.nextInt();
			YMD today = new YMD(y, m, d);
			today.dayOfYear();
			System.out.println(today.y + "��" + today.m + "��" + today.d + "��");

			System.out.println("1��: n�� �ڿ� ��¥�� ��ȯ�մϴ�.");
			System.out.println("2��: n�� ���� ��¥�� ��ȯ�մϴ�.");
			System.out.println("0��: ����˴ϴ�");
			System.out.println("�ٸ� ���ڸ� �����ø� �ٽ� ��¥�� ����մϴ�.");
			retry = in.nextInt();

			if (retry == 1) {
				System.out.println("n�� �ڸ� �Է��ϼ���");
				today.afterDay(in.nextInt());
				System.out.println(today.y + "��" + today.m + "��" + today.d + "��");
				continue;
			} else if (retry == 2) {
				System.out.println("n�� ���� �Է��ϼ���");
				today.beforeDay(in.nextInt());
				System.out.println(today.y + "��" + today.m + "��" + today.d + "��");
				continue;
			} else if (retry == 3) {
				break;
			}
		} while (true);
		in.close();

	}
}
