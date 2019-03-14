package chap01_7.Triangle;

import java.util.Scanner;
//이등변 삼각형 모두 출력
public class Q15 {
	static void triangleLB(int n,char mark){
		System.out.println("왼쪽 아래 직각");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.printf("%2c",mark);
			}
			System.out.println();
		}
	}
	static void triangleLT(int n,char mark){
		System.out.println("왼쪽 위 직각");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(n-i+1); j++){
				System.out.printf("%2c",mark);
			}
			
			System.out.println();
		}
	}
	static void triangleRT(int n,char mark){
		System.out.println("오른쪽 위 직각");
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
		System.out.println("오른쪽 아래 직각");
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
		System.out.println("이등변 삼각형을 출력합니다.");
		
		do{
			System.out.println("몇 단 삼각형입니까?");
			n = in.nextInt();
			System.out.println("삼각형을 채울 기호를 입력하시오(첫글자만 인식)");
			mark = in.next().charAt(0);
		}while(n<=0);
		triangleLB(n,mark);
		triangleLT(n, mark);
		triangleRB(n, mark);
		in.close();

	}
}
