package chap01_6.Loop;

import java.util.Scanner;
// * ���簢�� ���
public class Q14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���簢�� �Ѻ��� ���̸� �Է��Ͻÿ�");
		int n = in.nextInt();
		System.out.println("���簢���� ������ ��ȣ�� �Է��Ͻÿ�");
		char mark = in.next().charAt(0);//���ڿ��� �޴µ� ù���ڸ� ���
		for(int i=0; i<n; i++){
			for(int j =0; j<n; j++){
				
				System.out.printf("%2c", mark);
			}
			System.out.println();
		}
		in.close();

	}
}
