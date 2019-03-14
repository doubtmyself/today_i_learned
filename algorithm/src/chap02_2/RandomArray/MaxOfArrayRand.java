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
		
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = in.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++){
			height[i]= 100+rand.nextInt(90); //(n)값 0~n-1 까지 반환
			System.out.println("height["+i+"] = "+height[i]);
			
		}
		System.out.println("최대값은"+maxOf(height)+"입니다");
		in.close();
	}
	

}
