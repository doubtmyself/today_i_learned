package chap02_2.RandomArray;

import java.util.Random;
import java.util.Scanner;

/**
 *  MaxOfArrayRand + 사람 수 난수 생성
 *  컴퓨터가 생성한 난수는 의사 난수 진짜 난수가 아니다 부팅시 난수표를 생성하여 보관 
 *  seed 에 1을 넣으면 1-> 105 -> 999 -> 1002->... || 2을 넣으면 2 -> 892 -> 729 ->...
 *  -> 재부팅할때까지 난수표는 똑같다(서버는 재부팅 x -> 난수표가 같다?)
 *  => 현재시간을 참조해서 seed값을 설정해서 정해진 순서대로 뽑히는 난수(의사난수)를 진짜 난수로 변경한다.
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
		
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 는 1~50까지");
		int num = (rand.nextInt(50)+1);
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.(100~189까지)");
		for(int i=0; i<num; i++){
			height[i]= 100+rand.nextInt(90); //(n)값 0~n-1 까지 반환
			System.out.println("height["+i+"] = "+height[i]);
			
		}
		System.out.println("최대값은"+maxOf(height)+"입니다");
		in.close();
	}

}
