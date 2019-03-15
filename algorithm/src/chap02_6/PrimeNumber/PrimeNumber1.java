package chap02_6.PrimeNumber;

import java.util.Scanner;
/**
 * 다음줄에 i가 +1 되어있다 for문에선 +1된 i가 들어와서 멈춘것!!!
 * @author reg13
 *
 */

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("1~1000까지 소수를 열거합니다.");
		for (int n = 2; n <= 1000; n++) {// 소수 조건 자기자신과 1 외에 나눗셈이 실행되면 안된다.
			int i;
			for (i = 2; i < n; i++) {
				counter++;// 연산을 몇번 실행하는지 파악 -> 실행 속도를 알수 이싿.
				if (n % i == 0) {
					break; // 0 -> n이 i로 나머지 없이 나누어 떨어짐 -> 소수 조건 위반
				}
			}
			if (n == i) {//다음줄에 i가 +1 되어있다 for문에선 +1된 i가 들어와서 멈춘것!!!
				System.out.println(n);
			}
		}
		System.out.println("나누셈을 수행한 횟수" + counter);
		in.close();

	}

}
