package chap01_7.Triangle;

import java.util.Scanner;
//�̵ �ﰢ�� ��� ���
public class Q15 {
	static void triangleLB(int n,char mark){
		System.out.println("���� �Ʒ� ����");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2c",mark);
			}
			System.out.println();
		}
	}
	static void triangleLT(int n,char mark){
		System.out.println("���� �� ����");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n-i+1); j++){
				System.out.printf("%2c",mark);
			}
			
			System.out.println();
		}
	}
	static void triangleRT(int n,char mark){
		System.out.println("������ �� ����");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(i-1); j++){
				System.out.print("  ");
			}
			for(int j=1; j<=(n-i+1); j++){
				System.out.printf("%2c",mark);
			}
			System.out.println();
		}
	}
	static void triangleRB(int n,char mark){
		System.out.println("������ �Ʒ� ����");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n-i); j++){ //3 2 1
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++){
				System.out.printf("%2c",mark);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n;
		char mark;
		System.out.println("�̵ �ﰢ���� ����մϴ�.");
		
		do{
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = in.nextInt();
			System.out.println("�ﰢ���� ä�� ��ȣ�� �Է��Ͻÿ�(ù���ڸ� �ν�)");
			mark = in.next().charAt(0);
		}while(n<=0);
		triangleLB(n,mark);
		triangleLT(n, mark);
		triangleRB(n, mark);
		in.close();

	}
}
