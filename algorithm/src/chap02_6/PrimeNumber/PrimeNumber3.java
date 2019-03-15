package chap02_6.PrimeNumber;
/**
 *  n은 2씩 증가!!!
 *  제곱근은 대칭의 기준 제곱근 이하의 수만 나눠봐도됨
 * @author reg13
 *
 */

public class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for (int n = 5; n <= 1000; n += 2) { // n은 2씩 증가!!!
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) { //제곱근은 대칭의 기준 제곱근 이하의 수만 나눠봐도됨
				counter += 2; 
				// prime[i] * prime[i] -> 곱셈연산 && n % prime[i] -> 나머지 연산 => counter 2씩 증가
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) { // prime[i] * prime[i]이 성립되지 않을 경우 연산 for문 안을 돌지 않음 -> 곱셈연산산 counter++
				prime[ptr++] = n;
				counter++;
			}
		}
		for (int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
		System.out.println("곱셈과 나눗셈을 수행한 횟수 :" + counter);
	}

}
