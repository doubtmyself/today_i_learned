package chap01_2.Median;


import java.util.Scanner;
//�߾Ӱ� ��� Ȯ��
public class Q4 {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("med3(3,2,1) �߾Ӱ���"+ med3(3,2,1)+"�Դϴ�");
		System.out.println("med3(3,2,2) �߾Ӱ���"+ med3(3,2,2)+"�Դϴ�");
		System.out.println("med3(3,1,2) �߾Ӱ���"+ med3(3,1,2)+"�Դϴ�");
		System.out.println("med3(3,2,3) �߾Ӱ���"+ med3(3,2,3)+"�Դϴ�");
		System.out.println("med3(2,1,3) �߾Ӱ���"+ med3(2,1,3)+"�Դϴ�");
		System.out.println("med3(3,3,2) �߾Ӱ���"+ med3(3,3,2)+"�Դϴ�");
		System.out.println("med3(3,3,3) �߾Ӱ���"+ med3(3,3,3)+"�Դϴ�");
		System.out.println("med3(2,2,3) �߾Ӱ���"+ med3(2,2,3)+"�Դϴ�");
		System.out.println("med3(2,3,1) �߾Ӱ���"+ med3(2,3,1)+"�Դϴ�");
		System.out.println("med3(2,3,2) �߾Ӱ���"+ med3(2,3,2)+"�Դϴ�");
		System.out.println("med3(1,3,2) �߾Ӱ���"+ med3(1,3,2)+"�Դϴ�");
		System.out.println("med3(2,3,3) �߾Ӱ���"+ med3(2,3,3)+"�Դϴ�");
		System.out.println("med3(1,2,3) �߾Ӱ���"+ med3(1,2,3)+"�Դϴ�");
		in.close();
	}

}
