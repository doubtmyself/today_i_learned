package chap02_6.PrimeNumber;

/**
 * �Ҽ� ���ϴ� ���� �˰��� ���� �Ҽ� -> ¦���� ������ �Ҽ��� �ƴϴ� +�迭����
 */

public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;

		for (int n = 3; n <= 1000; n += 2) { // 3���� �Ҽ� ���� 2�� ����(Ȧ���� üũ)
			int i;
			for (i = 1; i < ptr; i++) {//�迭�� �� �Է�
				counter++;
				if (n % prime[i] == 0)
					break;
			}
			if (ptr == i)
				prime[ptr++] = n; //�Էµɶ����� +1�� !!!

		}
		System.out.println(ptr);
		for(int i =0; i<ptr; i++){
			System.out.println(prime[i]);			
		}
		System.out.println("�������� ������ Ƚ��"+counter);
	}
}
