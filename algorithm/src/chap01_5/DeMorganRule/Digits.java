package chap01_5.DeMorganRule;

import java.util.Scanner;
/**
 * 어떠한 값을 넣어도 첫번째 조건을 통과하면 두번째 조건을 통과한다.
 * => 두개는 같은 범위를 가르킨다.
 * @author reg13
 *
 */
public class Digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 정수를 입력하세요");
		do{
			System.out.println("입력 :");
			no = in.nextInt();
			
		}while(!(no>=10&&no<=99)); 
		/**
		 * 드모르간의 정의
		 * !(X&&Y) = !X||!Y 
		 * &&는 곱 ||은 합(OR)로 생각하자.
		 * 
		 */
		do{
			System.out.println("조건 통과");
		}while(!(no>=10)||!(no<=99)); 
	
		System.out.println("변수 no의 값은 "+ no + "가 되었습니다.");
		in.close();

	}
}
