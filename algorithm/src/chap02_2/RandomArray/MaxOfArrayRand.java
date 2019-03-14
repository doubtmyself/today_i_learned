package chap02_2.RandomArray;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
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
		System.out.println("��� �� : ");
		int num = in.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i=0; i<num; i++){
			height[i]= 100+rand.nextInt(90); //(n)�� 0~n-1 ���� ��ȯ
			System.out.println("height["+i+"] = "+height[i]);
			
		}
		System.out.println("�ִ밪��"+maxOf(height)+"�Դϴ�");
		in.close();
	}
	

}
