package chap01_7.Triangle;

import java.util.Scanner;
/**
 * 피라미드 출력 프로그램
 * 문자 출력은 하나의 값을 넣었을때 나오는 도형에 필요한 요소 적고 풀자
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
		System.out.println("피라미드를 출력합니다.");
		
		do{
			System.out.println("몇층의 피라미드입니까?");
			n = in.nextInt();
			System.out.println("삼각형을 채울 기호를 입력하시오(첫글자만 인식)");
			mark = in.next().charAt(0);
		}while(n<=0);
		spira(n,mark);
		in.close();

	}
}
