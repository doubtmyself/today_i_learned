package chap01_4.Sum;

import java.util.Scanner;
//����� 3 ���콺 ���
public class Q8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�. n�� �Է��ϼ���");
		int n = in.nextInt();
		double sum = (1+n)*((double)n/2);
		System.out.println("n������ ����"+sum);
		in.close();
	}

}
