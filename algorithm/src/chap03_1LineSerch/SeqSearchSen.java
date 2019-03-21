package chap03_1LineSerch;

import java.util.Scanner;

/**
 * break�� ���� Ż�� -> ���� ���� 2��°�� ������
 * @author reg13
 *
 */
public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; 
		// ���� �߰� ���������� key���� ���� �� ���� ���������� Ȯ������ �ʰ� �ڿ������� �迭�˻� 
		// ���������� �˻��ؼ� i ���� ������ ��(Ű��)�� ������ true �ٸ��� false �˻�

		while (true) {
			if (a[i] == key)//if �ѹ��� ���
				
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = in.nextInt();
		int[] x = new int[num+1];
		
		for(int i =0; i<num; i++){
			System.out.print("x["+i+"] :");
			x[i] = in.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int key = in.nextInt();
		
		int idx = seqSearchSen(x,num,key);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(key+"�� x["+idx+"]�� �ֽ��ϴ�.");
		in.close();
	}
}
