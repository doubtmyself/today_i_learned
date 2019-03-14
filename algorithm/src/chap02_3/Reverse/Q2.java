package chap02_3.Reverse;

import java.util.Random;
import java.util.Scanner;

/**
 * 배열을 역순으로 나타내는 프로그램 순서를 기술해라 Q3
 * 배열의 합계를 구하라 Q4
 * 
 * @author reg13
 *
 */
public class Q2 {
	public static int sumOf(int[] array){
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];		}
		System.out.println();
		return sum;
	}
	public static void reverse(int array[], int i1, int i2) {
		int temp;
		temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		System.out.println("a["+i1+"]과 a["+i2+"]를 교환합니다.");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("배열의 요솟수를 입력하세요");
		int n = in.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101) - 50;
		}
		System.out.println("배열 출력");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.println("역순 정렬");
		for (int i = 0; i < n/2.; i++) {
			reverse(array, i, n-i-1);
		}
		System.out.println("\n역순 정렬");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("배열의 합계"+ sumOf(array));
		in.close();
	}
}
