package chap02_2.RandomArray;

import java.util.Random;
import java.util.Scanner;

/**
 *  MaxOfArrayRand + ��� �� ���� ����
 *  ��ǻ�Ͱ� ������ ������ �ǻ� ���� ��¥ ������ �ƴϴ� ���ý� ����ǥ�� �����Ͽ� ���� 
 *  seed �� 1�� ������ 1-> 105 -> 999 -> 1002->... || 2�� ������ 2 -> 892 -> 729 ->...
 *  -> ������Ҷ����� ����ǥ�� �Ȱ���(������ ����� x -> ����ǥ�� ����?)
 *  => ����ð��� �����ؼ� seed���� �����ؼ� ������ ������� ������ ����(�ǻ糭��)�� ��¥ ������ �����Ѵ�.
 * @author reg13
 *
 */
public class Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.println("��� �� �� 1~50����");
		int num = (rand.nextInt(50)+1);
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.(100~189����)");
		for(int i=0; i<num; i++){
			height[i]= 100+rand.nextInt(90); //(n)�� 0~n-1 ���� ��ȯ
			System.out.println("height["+i+"] = "+height[i]);
			
		}
		System.out.println("�ִ밪��"+maxOf(height)+"�Դϴ�");
		in.close();
	}

}
