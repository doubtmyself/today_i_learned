package chap01_5.DeMorganRule;

import java.util.Scanner;
/**
 * ��� ���� �־ ù��° ������ ����ϸ� �ι�° ������ ����Ѵ�.
 * => �ΰ��� ���� ������ ����Ų��.
 * @author reg13
 *
 */
public class Digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ� ������ �Է��ϼ���");
		do{
			System.out.println("�Է� :");
			no = in.nextInt();
			
		}while(!(no>=10&&no<=99)); 
		/**
		 * ��𸣰��� ����
		 * !(X&&Y) = !X||!Y 
		 * &&�� �� ||�� ��(OR)�� ��������.
		 * 
		 */
		do{
			System.out.println("���� ���");
		}while(!(no>=10)||!(no<=99)); 
	
		System.out.println("���� no�� ���� "+ no + "�� �Ǿ����ϴ�.");
		in.close();

	}
}
