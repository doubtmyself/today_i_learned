package chap02_6.PrimeNumber;

import java.util.Scanner;
/**
 * �����ٿ� i�� +1 �Ǿ��ִ� for������ +1�� i�� ���ͼ� �����!!!
 * @author reg13
 *
 */

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("1~1000���� �Ҽ��� �����մϴ�.");
		for (int n = 2; n <= 1000; n++) {// �Ҽ� ���� �ڱ��ڽŰ� 1 �ܿ� �������� ����Ǹ� �ȵȴ�.
			int i;
			for (i = 2; i < n; i++) {
				counter++;// ������ ��� �����ϴ��� �ľ� -> ���� �ӵ��� �˼� �̚�.
				if (n % i == 0) {
					break; // 0 -> n�� i�� ������ ���� ������ ������ -> �Ҽ� ���� ����
				}
			}
			if (n == i) {//�����ٿ� i�� +1 �Ǿ��ִ� for������ +1�� i�� ���ͼ� �����!!!
				System.out.println(n);
			}
		}
		System.out.println("�������� ������ Ƚ��" + counter);
		in.close();

	}

}
