package chap01_6.Loop;

import java.util.Scanner;
// * 정사각형 출력
public class Q14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정사각형 한변의 길이를 입력하시오");
		int n = in.nextInt();
		System.out.println("정사각형을 구성할 기호를 입력하시오");
		char mark = in.next().charAt(0);//문자열을 받는데 첫글자만 출력
		for(int i=0; i<n; i++){
			for(int j =0; j<n; j++){
				
				System.out.printf("%2c", mark);
			}
			System.out.println();
		}
		in.close();

	}
}
