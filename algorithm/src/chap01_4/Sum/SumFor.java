package chap01_4.Sum;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1���� n������ ���� ����");
		System.out.print("n�� ��:");
		int n = in.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n;i++)
			sum += i;
		
		System.out.println("1����" + n +"������ ���� "+ sum + "�Դϴ�");
		in.close();
	}

}
