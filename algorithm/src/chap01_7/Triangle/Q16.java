package chap01_7.Triangle;

import java.util.Scanner;
/**
 * �Ƕ�̵� ��� ���α׷�
 * ���� ����� �ϳ��� ���� �־����� ������ ������ �ʿ��� ��� ���� Ǯ��
 * @author reg13
 *
 */
public class Q16 {
	static void spira(int n, char mark){
		for(int i =1; i<=n;i++){
			for(int j=0; j<n-i; j++){ 
				System.out.print(" ");
			}
			for(int j=0; j<(i-1)*2+1;j++){
				System.out.print(mark);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n;
		char mark;
		System.out.println("�Ƕ�̵带 ����մϴ�.");
		
		do{
			System.out.println("������ �Ƕ�̵��Դϱ�?");
			n = in.nextInt();
			System.out.println("�ﰢ���� ä�� ��ȣ�� �Է��Ͻÿ�(ù���ڸ� �ν�)");
			mark = in.next().charAt(0);
		}while(n<=0);
		spira(n,mark);
		in.close();

	}
}
