package chap02_6.PrimeNumber;

/**
 * 소수 구하는 문제 알고리즘 개선 소수 -> 짝수는 무조건 소수가 아니다 +배열저장
 */

public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;

		for (int n = 3; n <= 1000; n += 2) { // 3부터 소수 시작 2씩 증가(홀수만 체크)
			int i;
			for (i = 1; i < ptr; i++) {//배열에 값 입력
				counter++;
				if (n % prime[i] == 0)
					break;
			}
			if (ptr == i)
				prime[ptr++] = n; //입력될때마다 +1씩 !!!

		}
		System.out.println(ptr);
		for(int i =0; i<ptr; i++){
			System.out.println(prime[i]);			
		}
		System.out.println("나누셈을 수행한 횟수"+counter);
	}
}
