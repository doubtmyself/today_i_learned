package chap01_7.Triangle;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n;
		char mark;
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do{
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = in.nextInt();
			System.out.println("�ﰢ���� ä�� ��ȣ�� �Է��Ͻÿ�");
			mark = in.next().charAt(0);
		}while(n<=0);
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2c",mark);
			}
			System.out.println();
		}
		in.close();

	}

}
