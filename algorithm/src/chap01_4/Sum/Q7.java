package chap01_4.Sum;

import java.util.Scanner;
//����� 2 for�� ���
public class Q7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1���� n������ ���� ����");
		System.out.print("n�� ��:");
		int n = in.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			if(i<n)
			System.out.print("+");
		}
		System.out.println("="+ sum + "�Դϴ�");
		in.close();
	}

}
